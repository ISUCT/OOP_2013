/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author stud_6
 */
public class CanaryTest {
    
     @Test
    public void testDisplay() {
        System.out.println("display");
        Canary instance = new Canary();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        String res=instance.display();
        assertEquals("я - маленькая канарейка",res);
       
    }


     @Test
         public void testFly() {
        System.out.println("fly");
       
        Canary instance = new Canary();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        System.setOut(ps);
        instance.performFly();
        instance.setFlyBehavior(new FlyNoWay());
        assertEquals("Не хочу я летать\r\n", ba.toString());
      
       
    }
}
  
