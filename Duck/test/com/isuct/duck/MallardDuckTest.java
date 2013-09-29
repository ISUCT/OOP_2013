/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.duck;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


/**
 *
 * @author Stud_6
 */
public class MallardDuckTest {
    
    public MallardDuckTest() {
    }
 

    /**
     * Test of display method, of class MallardDuck.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("I have green head\r\n",ba.toString());
       
    }
    @Test
    public void testFly(){
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.performFly();
        instance.setFlyBehavior(new FlyWithWings());
        assertEquals("I can fly\r\n",ba.toString());
    }
}
