package bear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
/**
 *
 * @author Admin
 */
public class BrownBearTest {
    
    public BrownBearTest() {
    }
    
    
    @Test
    public void testDisplay() {
        System.out.println("display");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я бурый медвежонок\r\n",ba.toString());
            }
     @Test
    public void testRoar() {
        System.out.println("Roar");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.roar();
        assertEquals("Я рычуууу!!!\r\n",ba.toString());
}
     @Test
    public void testSleep() {
        System.out.println("Sleep");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.sleep();
        assertEquals("Я сплю!!!\r\n",ba.toString());
}
     @Test
    public void testEeeeatFish() {
        System.out.println("EeeeatFish");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performEatFish();
        assertEquals("Я ем рыбу\r\n",ba.toString());
}
     @Test
    public void testNoClimbTrees() {
        System.out.println("ClimbTrees");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performClimbTrees();
        assertEquals("Я не лажу по деревьям\r\n",ba.toString());
}

}
        