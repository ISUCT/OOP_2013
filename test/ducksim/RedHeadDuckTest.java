/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author alyona
 */
import java.io.ByteArrayOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class RedHeadDuckTest {
    
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
    public void testDisplay() {
        System.out.println("display");
        RedHeadDuck instance = new RedHeadDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(ba);
        System.setOut(ps);
       instance.display();
        assertEquals("My head is red\r\n",ba.toString());
      
    }
}

