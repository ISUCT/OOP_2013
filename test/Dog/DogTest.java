/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dog;

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
public class DogTest {
    
    public DogTest() {
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
     * Test of performSleep method, of class Dog.
     */
    @Test
    public void testPerformSleep() {
        System.out.println("performSleep");
        Dog instance = new DogImpl();
        instance.performSleep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performPlay method, of class Dog.
     */
    @Test
    public void testPerformPlay() {
        System.out.println("performPlay");
        Dog instance = new DogImpl();
        instance.performPlay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Dog.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Dog.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sleep method, of class Dog.
     */
    @Test
    public void testSleep() {
        System.out.println("sleep");
        Dog instance = new DogImpl();
        instance.sleep();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Dog.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Dog instance = new DogImpl();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Dog.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Dog instance = new DogImpl();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setsleepBehavior method, of class Dog.
     */
    @Test
    public void testSetsleepBehavior() {
        System.out.println("setsleepBehavior");
        SleepBehavior sb = null;
        Dog instance = new DogImpl();
        instance.setsleepBehavior(sb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setplayBehavior method, of class Dog.
     */
    @Test
    public void testSetplayBehavior() {
        System.out.println("setplayBehavior");
        PlayBehavior tb = null;
        Dog instance = new DogImpl();
        instance.setplayBehavior(tb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DogImpl extends Dog {

        public void display() {
        }
    }
}