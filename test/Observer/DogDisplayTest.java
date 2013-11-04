/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

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
public class DogDisplayTest {
    
    public DogDisplayTest() {
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
     * Test of update method, of class DogDisplay.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String breakfast = "";
        String dinner = "";
        String supper = "";
        DogDisplay instance = null;
        instance.update(breakfast, dinner, supper);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class DogDisplay.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        DogDisplay instance = null;
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}