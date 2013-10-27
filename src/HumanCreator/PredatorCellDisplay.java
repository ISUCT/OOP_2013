/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanCreator;

public class PredatorCellDisplay implements Observer, HerbivorousCellDisplay {

    private int man;
    private int woman;
    private int child;

    public void update(int man, int woman, int child) {
        this.man = man;
        this.woman = woman;
        this.child = child;
        display();

    }

    public void display() {
        System.out.println("Вывод");

    }
}
