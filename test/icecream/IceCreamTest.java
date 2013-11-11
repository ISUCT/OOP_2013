/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_6
 */
public class IceCreamTest {
 public IceCreamTest() {
    }
 
    @Test
    public void testCost() {
        System.out.println("cost");
        IceCream my = new NutIceCream ();
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
        IceCream my = new NutIceCream ();
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
