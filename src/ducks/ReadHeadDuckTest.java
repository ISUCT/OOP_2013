/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 *
 * @author stud_6
 */
public class RedHeadDuckTest {
    
    @Test
    public void testSwim() {
        System.out.println("swim");
        RedHeadDuck instance = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        //PrintStream old = System.out;
        System.setOut(ps);
        instance.swim();
        assertEquals("Буль-буль!\r\n", baos.toString()) ;
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testDisplay() {
        System.out.println("display");
        RedHeadDuck instance = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.display();
        assertEquals("Я красноголовая утка!\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
   @Test
    public void testFly () {
        System.out.println("Fly");
        RedHeadDuck duckRH = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        duckRH.setFlyBehavior(new FlyWithWings());
        duckRH.performFly();
        assertEquals("Я летаю с помощью крыльев!\r\n", baos.toString());
}
    @Test
    public void testQuack () {
        System.out.println("Quack");
        RedHeadDuck duckRH = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        //PrintStream old = System.out;
        System.setOut(ps);
        duckRH.setQuackBehavior(new Quack());
        duckRH.performQuack();
        assertEquals("Я умею крякать!\r\n", baos.toString());
    } 
}