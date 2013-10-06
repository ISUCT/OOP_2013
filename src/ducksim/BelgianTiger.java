/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ducksim;

public class BelgianTiger extends Tiger {
    
    public BelgianTiger() {
    growlBehavior = new Growlwith();

    eatBehavior = new Eat();
    
    }    
    
    @Override
    public void display(){
        System.out.println("Я утка маллордовая");
    }
    
}
