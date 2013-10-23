/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class PolarBearDisplayTest {
    
    public PolarBearDisplayTest() {
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
     * Test of update method, of class PolarBearDisplay.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        float breakfast = 0;
        float lunch = 0;
        float dinner = 0;
        PandaDisplay instance = new PandaDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.update(breakfast, lunch, dinner);
           assertEquals("Вывод\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
    }
}