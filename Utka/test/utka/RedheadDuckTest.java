/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utka;

import java.io.ByteArrayOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

/**
 *
 * @author Stud_6
 */
public class RedheadDuckTest {
    
    
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
     * Test of display method, of class RedHeadDuck.
     */
     @Test
    public void testDisplay() {
        System.out.println("display");
        RedheadDuck instance = new RedheadDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(ba);
        System.setOut(ps);
       instance.display();
        assertEquals("I have read head\r\n",ba.toString());
      
    }
}
