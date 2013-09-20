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
public class RubberDuckTest {
    
    @Test
    public void testSwim() {
        System.out.println("swim");
        RubberDuck instance = new RubberDuck();
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
        RubberDuck instance = new RubberDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        instance.display();
        assertEquals("Я резиновая утка!\r\n", baos.toString()) ;
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testFly() {
        System.out.println ("Fly");
        RubberDuck duckR = new RubberDuck ();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        duckR.setFlyBehavior(new FlyWithWings());
        duckR.performFly();
       assertEquals("Я не могу летать!\r\n", baos.toString()) ;
    }
    public void testQuack () {
        System.out.println("Quack");
        RubberDuck duckM = new RubberDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        //PrintStream old = System.out;
        System.setOut(ps);
        duckM.setQuackBehavior(new Squeak());
        duckM.performQuack();
        assertEquals("Я умею пищать!\r\n", baos.toString());
    } 
}
