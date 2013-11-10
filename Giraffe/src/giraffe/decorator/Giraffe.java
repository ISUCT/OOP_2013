/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package giraffe.decorator;

public class Giraffe extends CondimentDecorator {
    NewForm newForm;
    public Giraffe (NewForm newForm){
        this.newForm = newForm;
    }
    public String getDescription(){
        return newForm.getDescription()+" I can fly!";
    }

    
}
