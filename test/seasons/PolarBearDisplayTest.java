/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;


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
 * @author home
 */
public class PolarBearDisplayTest {
    
    public PolarBearDisplayTest() {
    }

   @Test
    public void testUpdate() {
        System.out.println("update");
        String winter;
        String spring;
        String summer;
        String autumn;
        PandaDisplay instance = new PandaDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        //PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        instance.update(" пора впадать в спячку. ", " пора просыпаться и искать что тебе покушать. ", " собирать ягоды и гонять пчёл. ", " готовься к спячке.");
           assertEquals("Вывод\r\n", baos.toString());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    
    }
}
