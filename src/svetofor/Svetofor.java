/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svetofor;

/**
 *
 * @author Юлия
 */
public class Svetofor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SvetoforData svetoforData = new SvetoforData ();
        CarDisplay carDisplay = new CarDisplay (svetoforData);
        
        svetoforData.setMeasurements(11, 13, 12);
        svetoforData.setMeasurements(8, 12, 21);
        svetoforData.setMeasurements(8, 17, 19);
    }
}
