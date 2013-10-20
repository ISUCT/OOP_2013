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
import patternobserver.ForecastDisplay;


public class ForecastDisplayTest {
    
    public ForecastDisplayTest() {
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
    public void testUpdate() {
        System.out.println("update");
        float temperature = 0.0F;
        float humidity = 0.0F;
        float pressure = 0.0F;
        ForecastDisplay instance = new ForecastDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        instance.update(temperature, humidity, pressure);
           assertEquals("Вывод прогноза\r\n", baos.toString());
        
    
    }
}
