/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import food.PandaDisplay;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Admin
 */
public class BearDisplayTest {
    
    public BearDisplayTest() {
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
     * Test of update method, of class BearDisplay.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
       PandaDisplay instance = new PandaDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.update(9, 13, 19);
           assertEquals("Вывод\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
    }
}