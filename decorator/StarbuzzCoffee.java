/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Stud_6
 */
public class StarbuzzCoffee {
    public static void main (String args []) {
        Beverage beverage = new Espresso ();
        System.out.println(beverage.getDescription() + "$"  + beverage.cost());
        
        Beverage beverage2 =new DarkRoast();
        beverage2 =new Mocha (beverage2);
                beverage2 =new Mocha (beverage2);
                beverage2 =new Whip (beverage2);
                
                System.out.println(beverage2.getDescription() + "$"  + beverage2.cost());
                
                Beverage beverage3 =new HouseBlend ();
                beverage3 =new Soy (beverage3);
 beverage2 =new Mocha (beverage2);
                beverage2 =new Whip (beverage2);   
                System.out.println(beverage3.getDescription() + "$"  + beverage3.cost());
    }

    private static void println(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
