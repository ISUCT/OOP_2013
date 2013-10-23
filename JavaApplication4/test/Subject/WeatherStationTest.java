/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Subject;

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
public class WeatherStationTest {
    
    public WeatherStationTest() {
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
     * Test of main method, of class WeatherStation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        WeatherData instance = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(instance);
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        System.setOut(ps);
        instance.setMeasurements(85,65,30.4f);
       assertEquals("Current conditions 85.0F degrees and65.0% humidity\r\n",ba.toString());
      
    }
}
