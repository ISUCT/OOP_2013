/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    
    public Mocha (Beverage beverage){
    this.beverage = beverage;
}
    /**
     *
     * @return
     */
    @Override
    public String getDescription () {
 return  beverage.getDescription() + ", Mocha";
}
    @Override
 public double cost (){
return .20 + beverage.cost;
}
}
