/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Starbuzz;

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
     * Test of getDescription method, of class Beverage.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Beverage instance = new BeverageImpl();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cost method, of class Beverage.
     */
    @Test
    public void testCost() {
        System.out.println("cost");
        Beverage instance = new BeverageImpl();
        double expResult = 0.0;
        double result = instance.cost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BeverageImpl extends Beverage {

        public double cost() {
            return 0.0;
        }
    }
}