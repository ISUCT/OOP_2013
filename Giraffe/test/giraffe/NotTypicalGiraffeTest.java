/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giraffe;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stud_6
 */
public class NotTypicalGiraffeTest {
    
   

    /**
     * Test of display method, of class NotTypicalGiraffe.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        NotTypicalGiraffe instance = new NotTypicalGiraffe();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("Hi! I'm not typical giraffe!\r\n",ba.toString());
       }
    
         @Test
    public void testRun() {
        System.out.println("run");
        NotTypicalGiraffe instance = new NotTypicalGiraffe();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.performRun();
        assertEquals("I'm runing now!\r\n",ba.toString());
       }
}

