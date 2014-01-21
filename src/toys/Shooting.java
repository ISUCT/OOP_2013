package toys;

public class Shooting implements ShootBehavior{
    int distance=0;
    @Override
    public void shoot(){
        System.out.println("ПИФ-ПАФ!");
    }
}
