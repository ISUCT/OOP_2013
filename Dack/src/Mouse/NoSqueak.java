package Mouse;

public class NoSqueak implements SqueakBehavior{

	
	@Override
	public void squeak() {
		System.out.println("Я не умею пищать...");
		
	}

}
