
package fabrica;

/**
 *
 * @author SAMSUNG
 */
public abstract class PizzaStore extends Pizza {
  public Pizza orderPizza (String type){
      Pizza pizza;
      pizza=createPizza(type);
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.box();
      return pizza;
      
  }
  abstract Pizza createPizza (String type);
}
