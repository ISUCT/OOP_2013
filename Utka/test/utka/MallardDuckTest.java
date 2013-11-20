/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utka;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MallardDuckTest {
    
  
    @Test
    public void testDisplay() {
        System.out.println("display");
        MallardDuck instance = new MallardDuck();
        ByteArrayOutputStream ba= new ByteArrayOutputStream();
        PrintStream ps=new PrintStream(ba);
        System.setOut(ps);
       instance.display();
        assertEquals("I have green head\r\n",ba.toString());
       
        
      
        
    }
}

