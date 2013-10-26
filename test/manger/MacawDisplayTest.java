
package manger;
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
        String fullmanger;
        String emptymanger;
        CokcatooDisplay instance = new CokcatooDisplay();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
      
        System.setOut(ps);
        instance.update( "полная. ", "Тогда желаю тебе риятного аппетита!!!" );
           assertEquals("Вывод информации о состоянии кормушки\r\n", baos.toString());
        
    
    
    }
}