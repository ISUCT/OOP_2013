package toys;

import java.util.ArrayList;

public class Target implements Subject {
    private ArrayList observeres;
    private int distance;
    public Target (){
        observeres = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer o){
    observeres.add(o);
    }
   
    @Override
    public void removeObserver(Observer o){
        int i = observeres.indexOf (o);
        if (i >= 0){
           observeres.remove(i);
        }
    }
    
    @Override
    public void notifyObservers (){
        for (int i = 0; i < observeres.size(); i++){
            Observer observer = (Observer)observeres.get(i);
            observer.update(distance);
        }
    }
     public void measurementsChanged() {
        notifyObservers();
    }
     
     public void setMeasurements (int distance){
        this.distance=distance;
        measurementsChanged ();
    }
}
