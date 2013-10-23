/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author Admin
 */
public class Food {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        FoodData foodData = new FoodData ();
        BearDisplay bearDisplay = new BearDisplay (foodData);
        
        foodData.setMeasurements(9, 13, 19);
        foodData.setMeasurements(8, 13, 20);
        foodData.setMeasurements(8, 14, 18);
        
        
        
    }
}
