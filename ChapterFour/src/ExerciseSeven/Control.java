package ExerciseSeven;

public class Control {

	public static void main(String[] args) {
		Person pepa = new Person("Pepa", 23);
		Person petra = new	Person("Petra", 21, pepa);
		Person pepik = new Person("Pepik", 3);
		
		
		House houseOne = new House(4, new Person[] {pepa, petra, pepik, pepik.createClone()} );
		houseOne.assesLivingConditions();
		
	}

}
