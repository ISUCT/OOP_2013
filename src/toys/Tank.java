package toys;

public class Tank extends Toys implements Observer {
private Subject target;
    public Tank() {
        moveBehavior = new Drive();
        speakBehavior = new NoSpeak();
        shootBehavior = new Shooting();   
    }
    public Tank(Subject target){
       this.target=target;
       target.registerObserver(this);
       }
    
@Override
    public void display() {
        System.out.println("Я танк!");
    }
  
@Override
    public void update(int distance) {
        display();
        System.out.println("До цели "+distance+" метров");
    }  
}