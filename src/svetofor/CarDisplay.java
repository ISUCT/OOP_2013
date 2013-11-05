/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svetofor;

/**
 *
 * @author Юлия
 */
public class CarDisplay implements Observer,PassengerCarDisplay {
private float green;
private float yellow;
private float red;
private Subject Car;


public CarDisplay (Subject Car){
        this.Car = Car ;
        Car.registerObserver(this);
        
    }
public void update (float breakfast, float lunch, float dinner){
   this.green = green;
   this.yellow = yellow;
   this.red = red;
        display();
        
    }
 public void display() {
        System.out.println("До зеленого сигнала светофора осталось "  +  green  +  "До желтого сигнала светофора осталось "  +   yellow   +   "До красного сигнала светофора осталось"   +   red );
    }
    
}
    

