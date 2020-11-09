package exerciseThree;

public class Person implements CanSing, PersonalizedPrint {

	String name;
	String gender;
	
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public void prettyPrint() {
		System.out.println("Hi my name is " + name + " and I am a **FANCY** " + gender);
	}

	@Override
	public void sing() {
		System.out.println("Si zneužitá svìtem jenom trochu a proto umíš lásku zabíjet.");
	}


	public static void main(String[] args) {
		Person pepa = new Person("Pepa", "man");
		Person julie = new Person("Julie","woman");
		
		julie.sing();
		pepa.prettyPrint();
	}

}
