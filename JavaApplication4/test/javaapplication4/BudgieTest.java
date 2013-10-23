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
public class BudgieTest {
  
  @Test
    public void testDisplay() {
        System.out.println("display");
        Budgie instance = new Budgie();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        String res=instance.display();
        assertEquals("Я маленький волнистый попугайчик",res);
       
    }


     @Test
         public void testFly() {
        System.out.println("fly");
       
        Budgie instance = new Budgie();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps= new PrintStream(ba);
        System.setOut(ps);
        instance.performFly();
        instance.setFlyBehavior(new FlyWithWings());
        assertEquals("Полетели!\r\n", ba.toString());
      
       
    }
}
