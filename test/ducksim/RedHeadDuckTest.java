/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

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
 * @author Лена
 */
public class RedHeadDuckTest {
    private Object instance;
    
    public RedHeadDuckTest() {
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
     * Test of display method, of class RedHeadDuck.
     */
    @Test
 public void testFly() {
        System.out.println("Fly");
        RedHeadDuck duck= new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        
       //IMPORTANT: Save the old System.out!
     PrintStream old = System.out;
     // Tell Java to use your special stream
     System.setOut(ps);
     duck.setFlyBehavior(new FlyWithWings());
     duck.performFly();
     assertEquals("I am flying!\r\n", baos.toString());
     
     
    }
         @Test
    public void testQuack() {
        System.out.println("Quack -Quack-Quack !");
        RedHeadDuck duck = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
        assertEquals("Quack -Quack-Quack !\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
          @Test
    public void testDisplay() {
        System.out.println("display");
        RedHeadDuck instance = new RedHeadDuck();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.display();
        assertEquals("I am RedHead duck\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
