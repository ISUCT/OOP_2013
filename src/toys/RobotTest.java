package toys;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class RobotTest {
    
    @Test
    public void testMove() {
        System.out.println("Движение");
        Robot instance = new Robot();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Шлеп-шлеп...\r\n", baos.toString()) ;
    }
    
    @Test
    public void testSpeak() {
        System.out.println("Голос");
        Robot instance = new Robot();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performSpeak();
        assertEquals("Привет!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testShoot() {
        System.out.println("Стрельба");
        Robot instance = new Robot();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("ПИФ-ПАФ!\r\n", baos.toString()) ;
    }
    
    @Test
    public void testDisplay() {
        System.out.println("Display");
        Robot instance = new Robot();
        ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.performMove();
        assertEquals("Я робот!\r\n", baos.toString()) ;
    }
}