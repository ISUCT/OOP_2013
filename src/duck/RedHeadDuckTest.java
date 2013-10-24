package duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class RedHeadDuckTest {
    
    @Test
    public void testSwim() {
        System.out.println("swim");
        RedHeadDuck instance = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.swim();
        assertEquals("All ducks float!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testDisplay() {
        System.out.println("display");
        RedHeadDuck instance = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.display();
        assertEquals("I'm ReadHead Duck!!\r\n", baos.toString());
        
    }
    
    
   @Test
    public void testFly () {
        System.out.println("Fly");
        RedHeadDuck duckRH = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        duckRH.performFly();
        assertEquals("i can fly\r\n", baos.toString());
}
    @Test
    public void testQuack () {
        System.out.println("Quack");
        RedHeadDuck duckRH = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        duckRH.performQuack();
        assertEquals("i can quake!\r\n", baos.toString());
    } 
}