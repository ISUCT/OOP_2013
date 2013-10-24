package toys;

public class Robot extends Toys implements Observer{
private Subject target;
    public Robot() {
        moveBehavior = new Walk();
        speakBehavior = new Speaking();
        shootBehavior = new Shooting();
    }
    public Robot(Subject target){
       this.target=target;
       target.registerObserver(this);
       }
@Override
    public void display() {
        System.out.println("Я робот!");
    }

    @Override
    public void update(int distance) {
        display();
        System.out.println("До цели "+distance+" метров");
    }
    
}
