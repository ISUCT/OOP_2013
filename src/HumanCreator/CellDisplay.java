/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanCreator;

public class CellDisplay implements Observer, HerbivorousCellDisplay {

    private int man;
    private int woman;
    private int child;
    private Subject CreatingHuman;

    public CellDisplay(Subject CreatingHuman) {
        this.CreatingHuman = CreatingHuman;
        CreatingHuman.registerObserver(this);

    }

    public void update(int man, int woman, int child) {
        this.man = man;
        this.woman = woman;
        this.child = child;
        display();

    }

    public void display() {
        System.out.println("Man will be creating after " + man + "yaers" + " Woman will be creating after " + woman + "yaers" + " Child will be creating after " + child + "yaers");
    }
}