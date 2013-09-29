/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Дашка1
 */
package com.isuct.duck;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stud_6
 */
public class RubberDuckTest {
    
    public RubberDuckTest() {
    }
    
      /**
     * Test of display method, of class RubberDuck.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        RubberDuck instance = new RubberDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("I'm rubber duck!\r\n",ba.toString());
    }
}