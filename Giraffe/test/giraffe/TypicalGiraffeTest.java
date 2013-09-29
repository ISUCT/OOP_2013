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
public class TypicalGiraffeTest {
    
    public TypicalGiraffeTest() {
    }


    /**
     * Test of display method, of class TypicalGiraffe.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        TypicalGiraffe instance = new TypicalGiraffe();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("Hi! I'm typical giraffe!\r\n",ba.toString());
       }
    
//     @Test
//    public void testMood() {
//        System.out.println("mood");
//        TypicalGiraffe instance = new TypicalGiraffe();
//        ByteArrayOutputStream ba = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(ba);
//        System.setOut(ps);
//        instance.setBehavior(new KindGiraffe());
//        assertEquals("( =^___^= )\r\n",ba.toString());
//       }
     
        @Test
    public void testRun() {
        System.out.println("run");
        TypicalGiraffe instance = new TypicalGiraffe();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.performRun();
        assertEquals("I'm runing now!\r\n",ba.toString());
       }
}
