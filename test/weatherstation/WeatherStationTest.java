/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherstation;

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
 * @author stud_6
 */
public class WeatherStationTest {
    
    public WeatherStationTest() {
    }

    /**
     * Test of main method, of class WeatherStation.
     */
    @Test
    public void testCurrentConditionsDisplay () {
        System.out.println("CurrentConditions");
        WeatherStation weatherData = new WeatherStation ();                  
        CurrentConditionsDisplay currentDisplay= new CurrentConditionsDisplay (weatherData);
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        weatherData.setMeasurement(80, 65, 30.4f);
        System.setOut(old);
        assertEquals("Текущее положение: 80.0 градусов по Фаренгейту, 65.0% влажности\r\n", baos.toString()) ;
    }

    @Test
    public void testForecastDisplay () {
        System.out.println("Forecast");
        WeatherStation weatherData = new WeatherStation ();                  
        ForecastDisplay forecastDisplay= new ForecastDisplay (weatherData);
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        weatherData.setMeasurement(80, 65, 30.4f);
        System.setOut(old);
        
        assertEquals("Прогноз \r\n" + "Температура " + (80.0+1) + " градусов по Фаренгейту, \r\n" + 
                "Влажность " + (65.0+1) + "% влажности \r\n" + "Давление " + (30.4+1) + "мм ртутного столба\r\n", baos.toString()) ;
    }
    
    @Test
    public void testStatisticDisplay () {
        System.out.println("Statistic");
        WeatherStation weatherData = new WeatherStation ();                  
        StatisticDisplay statisticDisplay= new StatisticDisplay (weatherData);
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        PrintStream old = System.out;
        System.setOut(ps);
        weatherData.setMeasurement(80, 65, 30.4f);
        System.setOut(old);
        
        assertEquals("Температура " + (80.0) + " градусов по Фаренгейту, \r\n" + 
                "Влажность " + 65.0 + "% влажности \r\n" + "Давление " + 30.4 + "мм ртутного столба\r\n", baos.toString()) ;
    }
}
