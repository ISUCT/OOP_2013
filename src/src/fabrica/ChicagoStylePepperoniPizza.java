/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

/**
 *
 * @author Юлия
 */
public class ChicagoStylePepperoniPizza  extends Pizza {
 public  ChicagoStylePepperoniPizza(){
     name="Chicago Style Deep Dish Pepperoni Pizza";
     dough="Extra Thick Crust Dough";
     sauce="Plum Tomato Sauce";
     toppings.add("Shredded Mozzarella Pepperoni");
 }
 void cut(){
     System.out.println("Cutting the pizza into square slices");
 }
}