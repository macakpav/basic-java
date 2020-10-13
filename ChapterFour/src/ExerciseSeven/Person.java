package ExerciseSeven;

public class Person {
	String name;
	int age;
	Person spouse = null;

	public Person(String name, int age) {
		this(name,age,null);
	}

	public Person(String name, int age, Person spouse) {
		this.name = name;
		this.age = age;
		this.spouse = spouse;
	}
	
	public static void marry(Person a, Person b) {
		a.spouse=b;
		b.spouse=a;
	}
	
	public boolean isMarried() {
		return (this.spouse != null);
	}
	
	public Person createClone() {
		return new Person(this.name,this.age,this.spouse);
	}

}
