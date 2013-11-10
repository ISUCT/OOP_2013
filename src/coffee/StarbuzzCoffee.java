/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package starbuzz;

/**
 *
 * @author ilya_hp
 */
public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "S"+beverage.cost());
        
        Beverage beverage2=new DarkRoast();
        beverage2=new Mocha(beverage2);
        beverage2=new Mocha(beverage2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+"S"+beverage2.cost());
        
        Beverage beverage3=new HouseBlend();
        beverage3=new Soy(beverage3);
        beverage3=new Mocha(beverage3);
        beverage3=new Whip(beverage3);
        System.out.println(beverage3.getDescription()+"S"+beverage3.cost());
        
   
    }
    
}
