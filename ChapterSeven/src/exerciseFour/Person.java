package exerciseFour;

public class Person implements CanSing {

	String name;
	String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public void makeNoiseOne() {
		System.out.println("Bleh");
	}

	@Override
	public void makeNoiseTwo() {
		System.out.println("Yay!");
	}

	@Override
	public void sing() {
		System.out.println("Si zneužitá svìtem jenom trochu a proto umíš lásku zabíjet.");
	}


	public static void main(String[] args) {
		Person pepa = new Person("Pepa", "man");
		Person julie = new Person("Julie","woman");
		
		julie.sing();
		pepa.makeNoiseOne();
	}

}
