package patternobserver.тесты;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patternobserver.CurrentConditionsDisplay;
import patternobserver.WeatherData;


public class CurrentConditionsDisplayTest {

    
    public CurrentConditionsDisplayTest() {
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
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(25,90,29.2f);
        CurrentConditionsDisplay instance = new CurrentConditionsDisplay(weatherData);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        instance.update(80, 65, 30.4f);
           assertEquals("Температура: 25.0 градусов, влажность: 90.0%\r\n", baos.toString());    
    }
}