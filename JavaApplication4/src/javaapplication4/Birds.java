package javaapplication4;

public abstract class Birds {
    
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    BirdBehavior birdBehavior;
    SleepBehavior sleepBehavior;
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performSound(){
        soundBehavior.Sound();
    }
    public void performBehavior(){
        birdBehavior.Behavior();
    }
    public void performSleep(){
        sleepBehavior.SleepBehavior();
    }
    
    public static void main(String[] args){
        Budgie Kesha = new Budgie();
        Kesha.display();
        Kesha.performFly();
        Kesha.performSound();
        Kesha.performBehavior();
        Kesha.performSleep();
        Kesha.setBirdBehavior(new CuteBird());
        Kesha.performBehavior();
        Kesha.setSoundBehavior(new Talk());
        Kesha.performSound();
        Penguin Jora = new Penguin();
        Jora.display();
        Jora.performSound();
        Jora.performFly();
        Jora.performBehavior();
    }
    public void sound() {
        System.out.println("Чирик-чирик");
}
    public abstract String display();
    public void setFlyBehavior (FlyBehavior fb){
        flyBehavior = fb;
    }  
    public void setSoundBehavior (SoundBehavior sb){
        soundBehavior = sb;
    }
    public void setSleepBehavior (SleepBehavior sb){
        sleepBehavior = sb;
    }
    public void setBirdBehavior (BirdBehavior bb){
        birdBehavior = bb;
    }
}
