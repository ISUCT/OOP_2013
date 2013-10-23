
package feed;
   /**
 * @author Бессонова Татьяна
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MacawDisplayTest {
    
    public MacawDisplayTest() {
    }
     
    @Test
    public void testUpdate() {
        System.out.println("update");
        float  morning = 1;
        float afternoon = 2;
        float evening = 3;
         CokcatooDisplay instance = new  CokcatooDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
      
        System.setOut(ps);
        instance.update( morning,afternoon, evening);
           assertEquals("Вывод информации о кормлении\r\n", baos.toString());
        
    
    
    }
}