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
public class RedheadDackTest {
    
    public RedheadDackTest(){
        
    }
    
    @Test
    public void testDisplay() {
        System.out.println("display");
         RedheadDack instance = new RedheadDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я красноголовая уточка\r\n",ba.toString());
            }
     @Test
    public void testFly() {
        System.out.println("Fly");
         RedheadDack instance = new  RedheadDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performFly();
        assertEquals("Я летаю!\r\n",ba.toString());
}
     @Test
    public void testSwim() {
        System.out.println("Swim");
         RedheadDack instance = new  RedheadDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.swim();
        assertEquals("Я плаваю!\r\n",ba.toString());
}
     @Test
    public void testQuack() {
        System.out.println("Quack");
         RedheadDack instance = new  RedheadDack();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performQuack();
        assertEquals("Кряяяяяяяяяяяяк!\r\n",ba.toString());
}
}
