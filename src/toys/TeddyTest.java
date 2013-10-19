package toys;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class TeddyTest {
    
    @Test
    public void testMove() {
        System.out.println("Движение");
        Teddy instance = new Teddy();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Hello! Я машу рукой!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testSpeak() {
        System.out.println("Голос");
        Teddy instance = new Teddy();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performSpeak();
        assertEquals("La La La :)\r\n", baos.toString()) ;
    }
    
    @Test
    public void testShoot() {
        System.out.println("Стрельба");
        Teddy instance = new Teddy();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я не умею стрелять!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Teddy instance = new Teddy();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я медведь!\r\n", baos.toString()) ;
    }
}