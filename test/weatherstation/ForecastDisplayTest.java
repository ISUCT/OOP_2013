
package weatherstation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


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

    /**
     * Test of update method, of class ForecastDisplay.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        float temperature = 0.0F;
        float humidity = 0.0F;
        float pressure = 0.0F;
        ForecastDisplay instance = new ForecastDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.update(temperature, humidity, pressure);
           assertEquals("Вывод прогноза\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
    }
}
