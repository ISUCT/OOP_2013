/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;
/**
 *
 * @author Дашка1
 */
public class PizzaTestDrive {
    public static void main (String[]args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName()+ "\n");
    }
    
}
