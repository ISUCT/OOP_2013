/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patternobserver.тесты;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patternobserver.StatisticsDisplay;

public class StatisticsDisplayTest {
    
    public StatisticsDisplayTest() {
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
 
    @Test
    public void testDisplay() {
        System.out.println("display");
        StatisticsDisplay instance = new StatisticsDisplay();
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        instance.display();
        assertEquals("Вывод статистики\r\n", baos.toString());
        

    }
}