
package fabrica;

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
 * @author Бессонова Татьяна
 */

public class PizzaTest {
    

    /**
     * Test of prepare method, of class Pizza.
     */
    @Test
    public void testPrepare() {
        System.out.println("prepare");
        Pizza my = new NYStylePepperoniPizza();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        my.prepare();
        assertEquals("Preparing NY Style Sauce and Cheese Pizza Tossing dougb... Adding sauce... Adding toppings: Grated Regiano Cheese\r\n", baos.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

        
    /**
     * Test of bake method, of class Pizza.
     */
    @Test
    public void testBake() {
        System.out.println("bake");
        Pizza my = new NYStylePepperoniPizza();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        my.bake();
        assertEquals("Bake for 25 minutes at 350\r\n", baos.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cut method, of class Pizza.
     */
    @Test
    public void testCut() {
        System.out.println("cut");
      Pizza my = new NYStylePepperoniPizza();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        my.cut();
        assertEquals("Cutting the pizza into diagonal slices\r\n", baos.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of box method, of class Pizza.
     */
    @Test
    public void testBox() {
        System.out.println("box");
     Pizza my = new NYStylePepperoniPizza();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        my.box();
        assertEquals("Place pizza in official PizzaStore box\r\n", baos.toString());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
