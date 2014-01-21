/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dishes;

/**
 *
 * @author SAMSUNG
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dish dish1 = new FriedPotatoes(); 
        System.out.println(dish1.getDescription() 
        + " - $" + dish1.cost () ) ; 

        Dish dish2 = new Pasta(); 
        dish2 = new Chicken(dish2);
        dish2 = new Mushrooms(dish2);
        dish2 = new Sauce(dish2);
        dish2 = new Shrimps(dish2);
        System.out.println(dish2.getDescription() 
        + " - $" + dish2.cost () ) ;
        
        Dish dish3 = new Rice(); 
        dish3 = new Fish(dish3);
        dish3 = new Sauce(dish3);
        System.out.println(dish3.getDescription() 
        + " - $" + dish3.cost () ) ;
    }           
}
