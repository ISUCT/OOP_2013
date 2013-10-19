package toys;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class TankTest {
    
    @Test
    public void testMove() {
        System.out.println("Движение");
        Tank instance = new Tank();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Вжжжжж...\r\n", baos.toString()) ;
    }
    
    @Test
    public void testSpeak() {
        System.out.println("Голос");
        Tank instance = new Tank();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performSpeak();
        assertEquals("...\r\n", baos.toString()) ;
    }
    
    @Test
    public void testShoot() {
        System.out.println("Стрельба");
        Tank instance = new Tank();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("ПИФ-ПАФ!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Tank instance = new Tank();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я танк!\r\n", baos.toString()) ;
    }
}