
package piecafe;

/**
 * @author Бессонова Татьяна
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class PieTest {
    
    public PieTest() {
    }
@Test
    public void testCost() {
        System.out.println("cost");
        Pie my = new ApplePie();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
    // IMPORTANT: Save the old System.out!
    //PrintStream old = System.out;
    // Tell Java to use your special stream
    System.setOut(ps);
       my.getDescription();
        assertEquals("", baos.toString());

    // TODO review the generated test code and remove the default call to fail.
    // fail("The test case is a prototype.");

    }
    @Test
    public void testgetDescription() {
        System.out.println("Unknown Beverage");
        Pie my = new ApplePie ();
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
