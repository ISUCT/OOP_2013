/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza;
/**
 *
 * @author Дашка1
 */
public class NYPizzaStore extends PizzaStore{
    Pizza createPizza (String item){
      if (item.equals("cheese")){
          return new NYStyleCheesePizza();
      } else if (item.equals("veggie")){
          return new NYStyleVeggiePizza();
      } else if (item.equals("clam")){
          return new NYStyleClamPizza();
      } else if(item.equals("pepperoni")){
          return new NYStylePepperoniPizza();
      } else return null;
}
}
