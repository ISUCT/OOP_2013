/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

   public class Squeack implements QuackBehavior {
   public void Squeack(){
   System.out.println("squeeeeeeeeeeeeeack");
}   

    @Override
    public void Quack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

