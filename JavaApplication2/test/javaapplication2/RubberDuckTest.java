/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

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
    
    public RubberDuckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of display method, of class RubberDuck.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        RubberDuck instance = new RubberDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        String res=instance.display();
        assertEquals("I'm little yellow duck",res);
    }
    
 @Test
         public void testFly() {
        System.out.println("fly");
       
        RubberDuck instance = new RubberDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        System.setOut(ps);
        instance.performFly();
        instance.setFlyBehavior(new FlyWithWings());
        assertEquals("I can't fly\r\n", ba.toString());
      
     }     
           
}