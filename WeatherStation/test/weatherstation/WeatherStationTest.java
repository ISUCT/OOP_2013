/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Observable;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stud_6
 */
public class WeatherStationTest {
    
    public WeatherStationTest() {
    }
    
        /**
     * Test of main method, of class WeatherStation.
     */
    @Test
    public void testMain() {
        System.out.println("Test for Station");
        WeatherData instance = new WeatherData();
        CurrentConditionsDisplay currentCon = new CurrentConditionsDisplay(instance);
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.setMeasurements(80, 65, 30.4f);
        
        //display
        assertEquals("Текущие условия: 80.0F градусов и 0.0% влажности\r\n",ba.toString());
        
        
     
    }
}
