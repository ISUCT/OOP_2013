package bear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author Admin
 */
public class PolarBearTest {
    
    public PolarBearTest() {
    }
    
    /**
     * Test of display method, of class MallardDack.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        PolarBear instance = new PolarBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я полярный медвежонок\r\n",ba.toString());
            }
     @Test
    public void testRoar() {
        System.out.println("Roar");
        PolarBear instance = new PolarBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.roar();
        assertEquals("Я рычуууу!!!\r\n",ba.toString());
}
     @Test
    public void testSleep() {
        System.out.println("Sleep");
        PolarBear instance = new PolarBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.sleep();
        assertEquals("Я сплю!!!\r\n",ba.toString());
}
     @Test
    public void testEeeeatFish() {
        System.out.println("EeeeatFish");
        PolarBear instance = new PolarBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performEatFish();
        assertEquals("Я ем рыбу\r\n",ba.toString());
}
      @Test
    public void testNoClimbTrees() {
        System.out.println("NoClimbTrees");
        PolarBear instance = new PolarBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performClimbTrees();
        assertEquals("Я не лажу по деревьям\r\n",ba.toString());
}
} 
