package toys;

public class Tank extends Toys{

    public Tank() {
        moveBehavior = new Drive();
        speakBehavior = new NoSpeak();
        shootBehavior = new Shooting();
    }
    
@Override
    public void display() {
        System.out.println("Я танк!");
    }
    
}