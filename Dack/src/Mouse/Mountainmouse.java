/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mouse;

/**
 *
 * @author stud_6
 */
public class Mountainmouse extends Mouse{

	public Mountainmouse(){
		 squeakBehavior = new Squeak();	
	}
	
	@Override
	public void display() {
		System.out.println("Я горная мышь");
		
	}
    
}
