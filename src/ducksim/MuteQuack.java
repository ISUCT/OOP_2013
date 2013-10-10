/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

/**
 *
 * @author alyona
 */
public class MuteQuack implements QuackBehavior{
    public void MuteQuack(){
        System.out.println("....");
    }

    @Override
    public void Quack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
        public void Squeack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}