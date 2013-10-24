package duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;


public class RubberDuckTest {
    
    @Test
    public void testSwim() {
        System.out.println("swim");
        RubberDuck instance = new RubberDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.swim();
        assertEquals("All ducks float!\r\n", baos.toString()) ;
        
    }
    @Test
    public void testDisplay() {
        System.out.println("display");
        RubberDuck instance = new RubberDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.display();
        assertEquals("I'm Rubber Duck!!\r\n", baos.toString()) ;
        
    }
    public void testFly() {
        System.out.println ("Fly");
        RubberDuck duckR = new RubberDuck ();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        duckR.performFly();
       assertEquals("i can't fly\r\n", baos.toString()) ;
    }
    public void testQuack () {
        System.out.println("Quack");
        RubberDuck duckM = new RubberDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        duckM.performQuack();
        assertEquals("i can squeak!\r\n", baos.toString());
    } 
}