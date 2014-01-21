package toys;

public class NoSpeak implements SpeakBehavior{
    @Override
    public void speak(){
        System.out.println("...");
    }
}
