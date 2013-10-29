/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bear;

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
 * @author Stud_6
 */
public class WhiteBearTest {
    
    public WhiteBearTest() {
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
     * Test of display method, of class WhiteBear.
     */
    @Test
    public void testDisplay() {
       System.out.println("display");
        WhiteBear instance = new WhiteBear();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("Я белый медведь)я с Северного полюса\r\n",ba.toString());
    }
}
