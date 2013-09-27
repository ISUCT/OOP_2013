package vehicle;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class PanzerTest {

	@Test
	public void testLook() {
		System.out.println ("look");
		QuadBike instance = new QuadBike ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.look();
        assertEquals("Я - танк!\r\n", baos.toString());
	}
    
	@Test
	public void testForward() {
		System.out.println ("forward");
		QuadBike instance = new QuadBike ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.forward();
        assertEquals("Еду вперед\r\n", baos.toString());
	}
	
	@Test
	public void testTurnToTheRight() {
		System.out.println ("turnToTheRight");
		QuadBike instance = new QuadBike ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.turnToTheRight();
        assertEquals("Поворачиваю направо\r\n", baos.toString());
	}
	
	@Test
	public void testTurnToTheLeft() {
		System.out.println ("turnToTheLeft");
		QuadBike instance = new QuadBike ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.turnToTheLeft();
        assertEquals("Поворачиваю налево\r\n", baos.toString());
	}
	
	@Test
	public void testStop() {
		System.out.println ("stop");
		QuadBike instance = new QuadBike ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.stop();
        assertEquals("Останавливаюсь\r\n", baos.toString());
	}
	
	@Test
	public void testAttack() {
		System.out.println ("attack");
		Panzer instance = new Panzer ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.setAttack(new AttackByCannon ());
        instance.performAttack();
        assertEquals("Я стреляю из пушки!\r\n", baos.toString());
	}
	
	@Test
	public void testDrive() {
		System.out.println ("drive");
		Panzer instance = new Panzer ();
		ByteArrayOutputStream baos = new ByteArrayOutputStream ();
        PrintStream ps = new PrintStream (baos);
        System.setOut(ps);
        instance.setDriveInForest(new DriveThroughtTrees());
        instance.performDriveInForest();
        assertEquals("Еду напролом\r\n", baos.toString());
	}
	
}
