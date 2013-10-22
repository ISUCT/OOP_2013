/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.station;

import java.util.Observable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_6
 */
public class CurrentConditionsDisplayTest {
    
    public CurrentConditionsDisplayTest() {
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
     * Test of update method, of class CurrentConditionsDisplay.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Observable obs = null;
        Object arg = null;
        CurrentConditionsDisplay instance = null;
        instance.update(obs, arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class CurrentConditionsDisplay.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        CurrentConditionsDisplay instance = null;
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
