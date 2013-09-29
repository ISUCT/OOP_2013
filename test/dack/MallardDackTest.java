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
public class MallardDackTest {
    
    public MallardDackTest() {
    }
    
   

    /**
     * Test of display method, of class MallardDack.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDack instance = new MallardDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я утка маллордовая\r\n",ba.toString());
            }
     @Test
    public void testFly() {
        System.out.println("Fly");
        MallardDack instance = new MallardDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performFly();
        assertEquals("Я летаю!\r\n",ba.toString());
}
     @Test
    public void testSwim() {
        System.out.println("Swim");
        MallardDack instance = new MallardDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.swim();
        assertEquals("Я плаваю!\r\n",ba.toString());
}
     @Test
    public void testQuack() {
        System.out.println("Quack");
        MallardDack instance = new MallardDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performQuack();
        assertEquals("Кряяяяяяяяяяяяк!\r\n",ba.toString());
}
}
        
       
        
        
        