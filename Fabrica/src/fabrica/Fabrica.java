
package fabrica;

/**
 *
 * @author Бессонова Татьяна
 */
public class Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     PizzaStore nyStore=new NYPizzaStore();
     PizzaStore chicagoStore=new ChicagoPizzaStore();
     Pizza pizza =nyStore.orderPizza("cheese");
     System.out.println("Ethan ordered a " + pizza.getName()+"\n");
     pizza=chicagoStore.orderPizza("cheese");
     System.out.println("Joel ordered a "+pizza.getName()+"\n");
    }

   
    }