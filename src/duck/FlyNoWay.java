/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Тимоша
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("Я не могу летать...");
}
}