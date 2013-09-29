/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

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
public class MallardDuckTest {
  
  @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        String res=instance.display();
        assertEquals("I have green head",res);
       
    }


     @Test
         public void testFly() {
        System.out.println("fly");
       
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        System.setOut(ps);
        instance.performFly();
        instance.setFlyBehavior(new FlyWithWings());
        assertEquals("I am flying!\r\n", ba.toString());
      
       
    }
}