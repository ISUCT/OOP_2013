/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giraffe.observers;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Stud_6
 */
public class TreeData extends Observable{
    private float height;
    private float distance;
    private boolean fruits;
    
    
    public static void main(String[] args) {
         
    TreeData treeData = new TreeData();     
    CurrentTreeDisplay currentDisplay = new CurrentTreeDisplay(treeData);
    
    treeData.setMeasurements(8, 5, true);
    treeData.setMeasurements(10, 10, false);
    
    }
    
     public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float height, float distance, boolean fruits){
        this.height = height;
        this.distance = distance;
        this.fruits = fruits;
        measurementsChanged();
    } 
    
    public float getHeight(){
        return height;
    }
    
    public float getDistance(){
        return distance;
    }
    
       public boolean getFruits(){
        return fruits;
    }
    
    
}
