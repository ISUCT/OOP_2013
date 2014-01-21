package toys;

public abstract class Toys {
    MoveBehavior moveBehavior;
    SpeakBehavior speakBehavior;
    ShootBehavior shootBehavior;
    
    public void performMove(){
    moveBehavior.move();
}
    public void performSpeak(){
    speakBehavior.speak();
}
    
    public void performShoot(){
    shootBehavior.shoot();
}
    
public abstract void display();

    public static void main(String[] args) {
    Robot rob = new Robot();
    rob.display();
    rob.performMove();
    rob.performSpeak();
    rob.performShoot();
    
    Teddy ted = new Teddy();
    ted.display();
    ted.performMove();
    ted.performSpeak();
    ted.performShoot();
    
    Doll sasha = new Doll();
    sasha.display();
    sasha.performMove();
    sasha.performSpeak();
    sasha.performShoot();
    
    Tank t34 = new Tank();
    t34.display();
    t34.performMove();
    t34.performSpeak();
    t34.performShoot();
        
    Target target = new Target();
    Tank ag14 = new Tank(target);
    Robot bob = new Robot(target);
    target.setMeasurements(35);
    target.setMeasurements(27);
    target.setMeasurements(20);
   
    }
}
