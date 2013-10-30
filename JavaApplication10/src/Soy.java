/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ксюша
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy (Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+", Soy";
    }
    @Override
    public double cost(){
        return.15+beverage.cost();
    }
}
