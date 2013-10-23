/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stud_6
 */
public class MallarDuckTest {
    
    public MallarDuckTest() {
    }
    
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallarDuck instance = new MallarDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream pa = new PrintStream(ba);
        System.setOut(pa);
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals ("Я зеленая голова\r\n", ba.toString());
        
    }
      @Test
    public void testFly() {
        System.out.println("fly");
        MallarDuck instance = new MallarDuck();
        instance.setFlyBehavior(new FlyWithWings());
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.performFly();
        
        assertEquals ("я лечу!\r\n", ba.toString());
        
}
}