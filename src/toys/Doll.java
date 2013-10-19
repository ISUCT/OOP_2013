package toys;

public class Doll extends Toys{

    public Doll() {
        moveBehavior = new NoMove();
        speakBehavior = new Singing();
        shootBehavior = new NoShoot();
    }
    
@Override
    public void display() {
        System.out.println("Я кукла!");
    }
    
}