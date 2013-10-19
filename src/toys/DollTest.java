package toys;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class DollTest {
    
    @Test
    public void testMove() {
        System.out.println("Движение");
        Doll instance = new Doll();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я не могу двигаться!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testSpeak() {
        System.out.println("Голос");
        Doll instance = new Doll();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performSpeak();
        assertEquals("La La La :)\r\n", baos.toString()) ;
    }
    
    @Test
    public void testShoot() {
        System.out.println("Стрельба");
        Doll instance = new Doll();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я не умею стрелять!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Doll instance = new Doll();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я кукла!\r\n", baos.toString()) ;
    }
}