/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icecream;

/**
 *
 * @author stud_6
 */
public class BeautifulIceCream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IceCream iceCream = new ChocolateIceCream(); 
        System.out.println(iceCream.getDescription() 
         +  iceCream.cost ()  +  " руб. " ) ; 

        IceCream iceCream2 = new FruitIceCream ();
        iceCream2 = new Raspberry (iceCream2);
        iceCream2 = new Banana (iceCream2);
        iceCream2 = new Strawberry (iceCream2);
        System.out.println(iceCream2.getDescription() 
        +  iceCream2.cost  ()  +  " руб. ") ; 
        
        IceCream iceCream3 = new NutIceCream ();
        iceCream3 = new Pistachio (iceCream3);
        iceCream3 = new Walnut (iceCream3);
        iceCream3 = new Cedar (iceCream3);
        System.out.println(iceCream3.getDescription() 
        +  iceCream3.cost ()+  " руб. " ) ; 
    }
}
    

