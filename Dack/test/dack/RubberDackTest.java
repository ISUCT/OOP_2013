/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dack;


import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
/**
 *
 * @author stud_6
 */
public class RubberDackTest {
    
    public RubberDackTest() {
    }
    
    
    /**
     * Test of display method, of class RubberDack.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        RubberDack instance = new RubberDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я резиновая уточка\r\n",ba.toString());
            }
     @Test
    public void testSwim() {
        System.out.println("Swim");
        RubberDack instance = new RubberDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.swim();
        assertEquals("Я плаваю!\r\n",ba.toString());
}
     @Test
    public void testSqueak() {
        System.out.println("Squeak");
        RubberDack instance = new RubberDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performSqueak();
        assertEquals("Писк\r\n",ba.toString());
            }
      @Test
    public void testFly() {
        System.out.println("Fly");
        RubberDack instance = new RubberDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performFly();
        assertEquals("Я не умею летать\r\n",ba.toString());
            }
}
