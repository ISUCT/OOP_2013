package toys;

public class Robot extends Toys{

    public Robot() {
        moveBehavior = new Walk();
        speakBehavior = new Speaking();
        shootBehavior = new Shooting();
    }
    
@Override
    public void display() {
        System.out.println("Я робот!");
    }
    
}
