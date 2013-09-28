/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mouse;


/**
 *
 * @author stud_6
 */
public class Forestmouse extends Mouse {

	public Forestmouse(){
	    squeakBehavior = new NoSqueak();	    	    
	}
	
	@Override
	public void display() {
		System.out.println("Я лесная мышь");
		
	}
    
}
