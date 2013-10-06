/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class BelgianTigerTest {
    
    public BelgianTigerTest() {
    }
    
   
    @Test
    public void testDisplay() {
        System.out.println("display");
        BelgianTiger instance = new BelgianTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я бельгийский тигр\r\n",ba.toString());
            }
     @Test
    public void testGrowl() {
        System.out.println("Fly");
        BelgianTiger instance = new BelgianTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performGrowl();
        assertEquals("Я рычу!\r\n",ba.toString());
}
     @Test
    public void testRun() {
        System.out.println("Run");
        BelgianTiger instance = new BelgianTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.run();
        assertEquals("Я бегуууу!\r\n",ba.toString());
}
     @Test
    public void testEat() {
        System.out.println("Eat");
        BelgianTiger instance = new BelgianTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performEat();
        assertEquals("Я ем!\r\n",ba.toString());
}
}
        
       