/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;
/**
 *
 * @author Дашка1
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sause";
        
        toppings.add("Shredded Mozzarella Cheese");
        
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
