/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanCreator;

public class PlantDisplay implements Observer, HerbivorousCellDisplay {

    private float man;
    private float woman;
    private float child;

    public void update(float man, float woman, float child) {
        this.man = man;
        this.woman = woman;
        this.child = child;
        display();

    }

    public void display() {
        System.out.println("Вывод");

    }
}
