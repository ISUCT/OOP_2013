/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

/**
 *
 * @author Дашка1
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Beverage beverage = new Espresso(); 
        System.out.println(beverage.getDescription() 
        + "$" + beverage.cost () ) ; 

        Beverage beverage2 = new DarkRoast ();
        beverage2 = new Mocha (beverage2);
        beverage2 = new Mocha (beverage2);
        beverage2 = new Whip (beverage2);
        System.out.println(beverage2.getDescription() 
        + "$" + beverage2.cost () ) ; 
        
        Beverage beverage3 = new HouseBlend ();
        beverage3 = new Soy (beverage3);
        beverage3 = new Mocha (beverage3);
        beverage3 = new Whip (beverage3);
        System.out.println(beverage3.getDescription() 
        + "$" + beverage3.cost () ) ; 
    }
}
