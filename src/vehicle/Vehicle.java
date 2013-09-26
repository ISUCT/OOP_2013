/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author stud_6
 */
public class Vehicle {

    DriveInForest driveInForest;
    Attack attackBehavior;
    
    public void forward () {
        System.out.println ("Еду вперед");
    }
    public void turnToTheRight () {
        System.out.print("Поворачиваю направо");
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
    
    public void setDriveInForest (DriveInForest typeOfDrive) {
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
        
    }
}
