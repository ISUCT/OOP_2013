/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class WhiteTigerTest {
    
    public WhiteTigerTest(){
        
    }
    
    @Test
    public void testDisplay() {
        System.out.println("display");
       WhiteTiger instance = new WhiteTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я белый тигр\r\n",ba.toString());
            }
     @Test
    public void testGrowl() {
        System.out.println("Growl");
        WhiteTiger instance = new WhiteTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performRun();
        assertEquals("Я бегу!\r\n",ba.toString());
}
     @Test
    public void testEat() {
        System.out.println("Eat");
        WhiteTiger instance = new WhiteTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.eat();
        assertEquals("Я ем!\r\n",ba.toString());
}
     @Test
    public void testRun() {
        System.out.println("Run");
        WhiteTiger instance = new WhiteTiger();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performRun();
        assertEquals("Я бегууу!\r\n",ba.toString());
}
}
