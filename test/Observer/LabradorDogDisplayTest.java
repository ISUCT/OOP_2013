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
public class LabradorDogDisplayTest {
    
    public LabradorDogDisplayTest() {
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
     * Test of update method, of class LabradorDogDisplay.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        String breakfast = "";
        String dinner = "";
        String supper = "";
        LabradorDogDisplay instance = new LabradorDogDisplay();
        instance.update(breakfast, dinner, supper);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class LabradorDogDisplay.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        LabradorDogDisplay instance = new LabradorDogDisplay();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}