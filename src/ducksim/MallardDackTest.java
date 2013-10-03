/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class MallardDackTest {
    
    public MallardDackTest() {
    }
    
   
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.display();
        assertEquals("Я утка маллордовая\r\n",ba.toString());
            }
     @Test
    public void testFly() {
        System.out.println("Fly");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performFly();
        assertEquals("Я летаю!\r\n",ba.toString());
}
     @Test
    public void testSwim() {
        System.out.println("Swim");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.swim();
        assertEquals("Я плаваю!\r\n",ba.toString());
}
     @Test
    public void testQuack() {
        System.out.println("Quack");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System. setOut(ps);
        instance.performQuack();
        assertEquals("Кряяяяяяяяяяяяк!\r\n",ba.toString());
}
}
        
       