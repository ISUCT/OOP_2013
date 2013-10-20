package MyMars;

public abstract class Mars {

    EatBehavior eatBehavior;
    GrowthBehavior growthBehavior;
    MoveBehavior moveBehavior;

    public void perfomEat() {
        eatBehavior.eat();
    }

    public void perfomGrowth() {
        growthBehavior.growth();
    }

    public void perfomMove() {
        moveBehavior.move();
    }

    public static void main(String[] args) {

        PredatorSell predator1 = new PredatorSell();
        predator1.disply();
        predator1.perfomEat();
        predator1.perfomGrowth();
        predator1.perfomMove();
        
        Plant plant1= new Plant();
        plant1.disply();
        plant1.perfomEat();
        plant1.perfomGrowth();
        plant1.perfomMove();
        
        HerbivorousCell Herbivorous= new HerbivorousCell();
        Herbivorous.disply();
        Herbivorous.perfomEat();
        Herbivorous.perfomGrowth();
        Herbivorous.perfomMove();
        


    }
}
