/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pizza;

/**
 *
 * @author nastyalobanova
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
