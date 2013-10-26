/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seasons;

/**
 *
 * @author Admin
 */
public class Seasons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        YearTimeData yearTimeData = new YearTimeData ();
        BearDisplay currentDisplay = new BearDisplay (yearTimeData);
        
        yearTimeData.setMeasurements(" пора впадать в спячку. ", " пора просыпаться и искать что тебе покушать. ", " собирать ягоды и гонять пчёл. ", " готовься к спячке.");
        yearTimeData.setMeasurements(" не впадаешь в спячку. ", " ты дальше продолжешь бодорствовать. ", " ты всё так же живёшь и радуешься жизни. ", " продолжай жить дальше)))");
        yearTimeData.setMeasurements(" всё равно,так как ты привык жить в холоде. " , " ,но ты не знаешь, что такое весна. ", " , к сожалению, ты про это не знаешь. ", " ты будешь жить, так как жил. ");
        
    }
}
