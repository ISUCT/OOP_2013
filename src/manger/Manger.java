
package manger;

/**
 * @author Бессонова Татьяна
 */
public class Manger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        MangerData mangerData = new MangerData ();
        ParrotsDisplay parrotsDisplay = new ParrotsDisplay (mangerData);
        
        mangerData.setMeasurements(" полная. ", "Тогда желаю тебе риятного аппетита!!!" );
        mangerData.setMeasurements(" пустая. ", "Тогда тебе нужно попросить, чтобы тебе дали покушать!!!" );
        mangerData.setMeasurements(" средне заполенная. ", "Тогда покушай и попроси добавки!!!" );
        
        
        
    }
}
