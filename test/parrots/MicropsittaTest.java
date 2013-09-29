
package parrots;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class MicropsittaTest {
    
    public MicropsittaTest() {
    }

    @Test
    public void testDisplay() {
        System.out.println("display");
       Micropsitta instance = new Micropsitta();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Здравствуйте, Я самый маленький в мире попугайчик - дятловый \r\n",ba.toString());
            }
    
     @Test
    public void testFly() {
        System.out.println("Fly");
        Micropsitta instance = new Micropsitta();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.fly();
        assertEquals("Я умею летать!!!!!\r\n",ba.toString());
}
     
     @Test
    public void testNoCommunicate () {
        System.out.println("NoCommunicate ");
       Micropsitta instance = new Micropsitta();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performCommunicate();
        assertEquals("Я не умею разговаривать, я только чирикаю!!!\r\n",ba.toString());
}
     @Test
    public void testLessSize () {
        System.out.println("LessSize ");
        Micropsitta instance = new Micropsitta();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performSize();
        assertEquals("Я меньше, чем АРА!!!\r\n",ba.toString());
}
     @Test
    public void testNoTopknot() {
        System.out.println("NoTopknot");
        Micropsitta instance = new Micropsitta();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performTopknot();
        assertEquals("А у меня в отличии от КАКАДУ, нет хохолка!!!\r\n",ba.toString());
     }
}
        
       
      