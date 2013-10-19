package toys;

public class NoShoot implements ShootBehavior{
    @Override
    public void shoot(){
        System.out.println("Я не умею стрелять!");
    }
}
