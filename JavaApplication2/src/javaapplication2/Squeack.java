/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author stud_6
 */

   public class Squeack implements QuackBehavior {
   public void Squeack(){
   System.out.println("squeack squeack");
}   

    @Override
    public void Quack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

