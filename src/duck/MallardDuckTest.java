package duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class MallardDuckTest {

    
    @Test
    public void testSwim() {
        System.out.println("swim");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.swim();
        assertEquals("All ducks float!\r\n", baos.toString()) ;

    }
    
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.display();
        assertEquals("I'm Mallard Duck!\r\n", baos.toString());
        

    }
    
    
   @Test
    public void testFly () {
        System.out.println("Fly");
        MallardDuck duckM = new MallardDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        duckM.performFly();
        assertEquals("i can fly\r\n", baos.toString());
}
    @Test
    public void testQuack () {
        System.out.println("Quack");
        MallardDuck duckM = new MallardDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        duckM.performQuack();
        assertEquals("i can quake!\r\n", baos.toString());
    } 
}