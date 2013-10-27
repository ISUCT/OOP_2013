/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanCreator;

import java.util.ArrayList;

public class HumanData implements Subject {

    private ArrayList observers;
    private int man;
    private int woman;
    private int child;

    public HumanData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);

        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(man, woman, child);
        }
    }

    public void maesurementChanged() {
        notifyObservers();

    }

    public void setMeasurements(int man, int woman, int child) {
        this.man = man;
        this.woman = woman;
        this.child = child;
        maesurementChanged();

    }
}