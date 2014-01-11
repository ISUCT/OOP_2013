/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;
/**
 *
 * @author Дашка1
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza= createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    abstract Pizza createPizza (String type);
}
