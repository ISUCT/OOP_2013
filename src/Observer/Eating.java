/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Alyona
 */
public class Eating {

   
    public static void main(String[] args) {
        // TODO code application logic here
        EatingTime eatingTime = new EatingTime ();
        DogDisplay currentDisplay = new DogDisplay (eatingTime);
        
        eatingTime.setMeasurements(" кашу с рыбой. ", " Педигри. ", " косточку. ");
        eatingTime.setMeasurements(" творог с овощами. ", " мясной стейк. ", " кашу с рыбой. ");
        eatingTime.setMeasurements(" Педигри. " , " косточку. ", " мясной стейк. ");
        
    }
}
