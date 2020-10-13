package ExerciseSeven;

public class House {

	int maxInhabitants;
	Person[] inhabitants;

	public House(int maxInhabitants, Person[] inhabitants) {
		this.maxInhabitants = maxInhabitants;
		this.inhabitants = inhabitants;
	}

	public void assesLivingConditions() {
		int noInhabitants = inhabitants.length;
		if (this.maxInhabitants > noInhabitants) {
			System.out.println("There is still room in the house.");
		} else if (this.maxInhabitants == noInhabitants) {
			System.out.println("The house is full.");
		} else {
			System.out.println("There are too many people living in this house!");
		}
	}

}
