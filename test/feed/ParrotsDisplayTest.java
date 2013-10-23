
package feed;
/**
 * @author Бессонова Татьяна
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import feed. ParrotsDisplay;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ParrotsDisplayTest {
    
    public ParrotsDisplayTest() {
    }
   
    @Test
    public void testDisplay() {
        System.out.println("display");
        CokcatooDisplay instance = new  CokcatooDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
       
        System.setOut(ps);
        instance.update(9, 13, 19);
           assertEquals("Вывод информации о кормлении\r\n", baos.toString());
        
    
    
    }
}