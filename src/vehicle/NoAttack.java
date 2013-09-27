package vehicle;

public class NoAttack implements Attack{
	@Override
	public void attack () {
		System.out.println("Я не атакую");
	}

}
