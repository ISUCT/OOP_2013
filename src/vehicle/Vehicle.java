package vehicle;

public abstract class Vehicle {

    DriveinForest driveInForest;
    Attack attackBehavior;
    
    public abstract void look ();
    
    public void forward () {
        System.out.println ("Еду вперед");
    }
    public void turnToTheRight () {
        System.out.println("Поворачиваю направо");
    }
    
    public void turnToTheLeft () {
        System.out.println("Поворачиваю налево");
    }
    
    public void stop () {
        System.out.println("Останавливаюсь");
    }
    
    public void setAttack (Attack typeOfAttack) {
        this.attackBehavior = typeOfAttack;
    }
    
    public void setDriveInForest (DriveinForest typeOfDrive) {
        this.driveInForest = typeOfDrive;
    } 
    
    public void performAttack () {
        attackBehavior.attack();
    } 
    
    public void performDriveInForest () {
        driveInForest.driveInForest();
    }

    public static void main(String[] args) {
        // TODO code application logic here
    QuadBike quadBike = new QuadBike ();
    Panzer panzer = new Panzer ();
    
    quadBike.look();
    quadBike.setAttack(new NoAttack ());
    quadBike.performAttack();
    quadBike.forward();
    quadBike.turnToTheLeft();
    quadBike.turnToTheRight();
    quadBike.setDriveInForest(new BypassTrees());
    quadBike.performDriveInForest();
    quadBike.stop();
    
    panzer.look();
    panzer.setAttack(new AttackByCannon());
    panzer.performAttack();
    panzer.forward();
    panzer.turnToTheLeft();
    panzer.turnToTheRight();
    panzer.setDriveInForest(new DriveThroughtTrees());
    panzer.performDriveInForest();
    panzer.stop();
    // The end :)
    
    
    
    }
}
