package bear;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
/**
 *
 * @author Admin
 */
public class PandaTest {
    
    public PandaTest() {
    }
    
   

    
    @Test
    public void testDisplay() {
        System.out.println("display");
        Panda instance = new Panda();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я панда\r\n",ba.toString());
            }
     @Test
    public void testRoar() {
        System.out.println("Roar");
        Panda instance = new Panda();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.roar();
        assertEquals("Я рычуууу!!!\r\n",ba.toString());
}
     @Test
    public void testSleep() {
        System.out.println("Sleep");
        Panda instance = new Panda();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.sleep();
        assertEquals("Я сплю!!!\r\n",ba.toString());
}
     @Test
    public void testNoEatFish() {
        System.out.println("NoEatFish");
        Panda instance = new Panda();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performEatFish();
        assertEquals("Я не ем рыбу\r\n",ba.toString());
}
     @Test
    public void testClimbTrees() {
        System.out.println("ClimbTrees");
        Panda instance = new Panda();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performClimbTrees();
        assertEquals("Я лажу по деревьям\r\n",ba.toString());
}

}
        