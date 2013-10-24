package toys;

public class Teddy extends Toys{

    public Teddy() {
        moveBehavior = new Wave();
        speakBehavior = new Singing();
        shootBehavior = new NoShoot();
    }
    
@Override
    public void display() {
        System.out.println("Я медведь!");
    }
    
}