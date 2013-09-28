/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mouse;

/**
 *
 * @author stud_6
 */
public class Stripedmouse extends Mouse {

	public Stripedmouse(){
		 squeakBehavior = new Squeak();	
	}
	
	@Override
	public void display() {
		
			System.out.println("Я какая-то мышь");
		
				
	}

	
    
}
