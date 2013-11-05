/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzCoffee;

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
 * @author Юлия
 */
public class BeverageTest {
    
    public BeverageTest() {
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
     * Test of cost method, of class Beverage.
     */
     @Test
    public void testCost() {
        System.out.println("cost");
       Beverage my = new HouseBlend ();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        my.cost();
           assertEquals("", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
    }
     @Test
    public void testgetDescription() {
        System.out.println("Unknown Beverage");
       Beverage my = new HouseBlend ();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        my.getDescription();
           assertEquals("", baos.toString());
        

}
}