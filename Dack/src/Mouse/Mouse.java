/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mouse;

public abstract class Mouse extends Animal {

	SqueakBehavior squeakBehavior;

	public void performSqueak() {
		squeakBehavior.squeak();
	}

	public static void main(String[] args) {

		Forestmouse tina = new Forestmouse();
		tina.display();
		tina.performSqueak();

		Mountainmouse molly = new Mountainmouse();
		molly.display();
		molly.performSqueak();

		Stripedmouse jane = new Stripedmouse();
		jane.display();
		jane.performSqueak();

	}
}
