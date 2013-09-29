/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parrots;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class MacawTest {
    
    public MacawTest() {
    }

    @Test
    public void testDisplay() {
        System.out.println("display");
       Macaw instance = new Macaw();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Здравствуйте, Я попугай АРА\r\n",ba.toString());
            }
    
     @Test
    public void testFly() {
        System.out.println("Fly");
        Macaw instance = new Macaw();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.fly();
        assertEquals("Я умею летать!!!!!\r\n",ba.toString());
}
     
     @Test
    public void testСommunicate() {
        System.out.println("Сommunicate");
        Macaw instance = new Macaw();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performCommunicate();
        assertEquals("Я поддаюсь обучению разговаривать!!!\r\n",ba.toString());
}
     @Test
    public void testSize() {
        System.out.println("Size");
        Macaw instance = new Macaw();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performSize();
        assertEquals("Я большого размера!!!\r\n",ba.toString());
}
     @Test
    public void testNoTopknot() {
        System.out.println("NoTopknot");
        Macaw instance = new Macaw();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performTopknot();
        assertEquals("А у меня в отличии от КАКАДУ, нет хохолка!!!\r\n",ba.toString());
     }
}
        
       
        
        
        