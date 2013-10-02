/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

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
 * @author Елена
 */
public class MopedTest {
    
    public MopedTest() {
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
     * Test of display method, of class Moped.
     */
@Test
    public void testDisplay() {
        System.out.println("display");
        Moped instance = new Moped();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.display();
        assertEquals("It is Moped\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
@Test
    public void testDrive() {
        System.out.println("I am driving!");
        Moped instance = new Moped();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.drive();
        assertEquals("I am driving!\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    @Test
    public void testSound() {
        System.out.println("Bip-Bip-Bip");
        Moped instance = new Moped();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.sound();
        assertEquals("Bip-Bip-Bip\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}