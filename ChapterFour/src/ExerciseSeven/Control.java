package ExerciseSeven;

public class Control {

	public static void main(String[] args) {
		Person pepa = new Person("Pepa", 23);
		Person petra = new	Person("Petra", 21, pepa);
		Person pepik = new Person("Pepik", 3);
		
		Person[] family = {pepa, petra, pepik, pepik.createClone()};
		
		House houseOne = new House(4, family );
		houseOne.assesLivingConditions();
		
	}

}
