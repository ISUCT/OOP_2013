package patternobserver.тесты;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patternobserver.ThirdPartyDisplay;


public class ThirdPartyDisplayTest {
    
    public ThirdPartyDisplayTest() {
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
        ThirdPartyDisplay instance = new ThirdPartyDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        instance.update(temperature, humidity, pressure);
           assertEquals("Вывод другой информации на основании полученных данных\r\n", baos.toString());
    
    }
}