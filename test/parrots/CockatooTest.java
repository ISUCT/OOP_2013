package parrots;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class CockatooTest {
    
    public CockatooTest() {
    }

    @Test
    public void testDisplay() {
        System.out.println("display");
        Cockatoo instance = new Cockatoo();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Здравствуйте, Я попугай  КАКАДУ\r\n",ba.toString());
            }
    
     @Test
    public void testFly() {
        System.out.println("Fly");
        Cockatoo instance = new Cockatoo();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.fly();
        assertEquals("Я умею летать!!!!!\r\n",ba.toString());
}
     
     @Test
    public void testNoCommunicate () {
        System.out.println("NoCommunicate ");
        Cockatoo instance = new Cockatoo();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performCommunicate();
        assertEquals("Я не умею разговаривать, я только чирикаю!!!\r\n",ba.toString());
}
     @Test
    public void testLessSize () {
        System.out.println("LessSize ");
        Cockatoo instance = new Cockatoo();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performSize();
        assertEquals("Я меньше, чем АРА!!!\r\n",ba.toString());
}
     @Test
    public void testTopknot() {
        System.out.println("Topknot");
        Cockatoo instance = new Cockatoo();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performTopknot();
        assertEquals("А у меня есть хохолок на голове!!!\r\n",ba.toString());
     }
}
        
       
      