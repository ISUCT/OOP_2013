package Mouse;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class ForestmouseTest {

	@Test
	public void test() {
		  System.out.println("display");
	        Forestmouse instance = new Forestmouse();
	        ByteArrayOutputStream ba = new ByteArrayOutputStream();
	        PrintStream ps = new PrintStream(ba);
	        System.setOut(ps);
	        instance.display();
	        assertEquals("� ������ ����\r\n",ba.toString());
	}
	 @Test
	    public void squeakFly(){
		 Forestmouse instance = new Forestmouse();
	        ByteArrayOutputStream ba = new ByteArrayOutputStream();
	        PrintStream ps = new PrintStream(ba);
	        System.setOut(ps);
	        instance.performSqueak();
	        assertEquals("� �� ���� ������...\r\n",ba.toString());
	    }
}
