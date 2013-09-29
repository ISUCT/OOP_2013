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
public class RedheadDuckTest {
    
    public RedheadDuckTest() {
    }
    
     /**
     * Test of display method, of class RedheadDuck.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        RedheadDuck instance = new RedheadDuck();
        ByteArrayOutputStream ba = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(ba);
        System.setOut(ps);
        instance.display();
        assertEquals("I have red head!\r\n",ba.toString());
    }
}
