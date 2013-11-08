/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starbuzz;

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
 * @author nastyalobanova
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
    public void testCost() {
        System.out.println("cost");
        Beverage my= new HouseBlend();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        my.getDescription();
        assertEquals("",baos.toString());
        
      
    }

    /**
     * Test of cost method, of class Beverage.
     */
    @Test
    public void testDescription() {
        System.out.println("Unknown Beverage");
        Beverage my = new HouseBlend();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        my.getDescription();
        assertEquals("", baos.toString());
        
    }
}

    
