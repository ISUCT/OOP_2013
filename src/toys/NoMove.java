package toys;

public class NoMove implements MoveBehavior{
    @Override
    public void move(){
        System.out.println("Я не могу двигаться!");
    }
}
