/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;
/**
 *
 * @author Дашка1
 */
public class ChicagoPizzaStore extends PizzaStore{
    Pizza createPizza (String item){
      if (item.equals("cheese")){
          return new ChicagoStyleCheesePizza();
      } else if (item.equals("veggie")){
          return new ChicagoStyleVeggiePizza();
      } else if (item.equals("clam")){
          return new ChicagoStyleClamPizza();
      } else if(item.equals("pepperoni")){
          return new ChicagoStylePepperoniPizza();
      } else return null;
}
}
