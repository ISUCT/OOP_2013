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
public class BrownBearTest {
    
    public BrownBearTest() {
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
     * Test of display method, of class BrownBear.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("Я русский бурый медведь!!!\r\n",ba.toString());
       
    }
     @Test
    public void testSleep() {
       System.out.println("sleep");
        BrownBear instance = new BrownBear();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(ba);
        System.setOut(ps);
        instance.performSleep();
        assertEquals("Я люблю спать зимой....\r\n",ba.toString());
}
}
