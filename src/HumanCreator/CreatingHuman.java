/*  
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanCreator;

public class CreatingHuman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        HumanData humanData = new HumanData();
        CellDisplay cellDisplay = new CellDisplay(humanData);

        humanData.setMeasurements(3000, 3000, 3001);



    }
}