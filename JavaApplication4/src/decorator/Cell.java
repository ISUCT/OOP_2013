/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import javaapplication4.Birds;

public class Cell extends BirdsDecorator {
    Birds bird;
    public Cell (Birds unknown){
        this.bird = unknown;
    }
  
    @Override
   public String getDescription(){
        return bird.getDescription()+" в клетке";
    }

    @Override
    public String display() {
        return "some";//bird.display();
    }

    @Override
    public void update(boolean fullness, String weather) {
        bird.update(fullness, weather);
    }

}