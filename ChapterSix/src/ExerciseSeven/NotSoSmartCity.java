package ExerciseSeven;

public class NotSoSmartCity {

	private String[] inhabitantNames;
	private int nbInhabitants;
	private double totalAmountOfMoney;
	private String name;

	public NotSoSmartCity(String name, int nbInhabitants, double totalAmountOfMoney, String[] inhabitantNames) {
		this.name = name;
		this.nbInhabitants = nbInhabitants;
		this.totalAmountOfMoney = totalAmountOfMoney;
		this.inhabitantNames = inhabitantNames;
	}

	public void printCityNameForEachInhabitant() {
		for (int i = nbInhabitants; i != 0; i--) {
			System.out.println(this.name);
		}
	}

	public double getAverageAmountOfMoney() {
		return totalAmountOfMoney / nbInhabitants;
	}

	public static String babyNameGenerator(String beginning, int lettersToAdd) {
		if (0 == lettersToAdd) {
			return beginning;
		} else {
			return babyNameGenerator(beginning + getRandomLetter(), lettersToAdd - 1);
		}
	}

	private static char getRandomLetter() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		return alphabet.charAt((int) (Math.random() * alphabet.length()));
	}

	public void printInhabitantNames() {
		for (int i = 0; i < nbInhabitants; i++) {
			System.out.println(inhabitantNames[i]);
		}
	}

	public static void main(String[] args) {		
		NotSoSmartCity city = new NotSoSmartCity("Bleh city", 2, 100, new String[] { "P" });
		
		// double  = city.getAverageAmountOfMoney(); // Infinity

		// NullPointerException
		NotSoSmartCity fakeCity = new NotSoSmartCity("Face City", 10, 450.1, null);
		fakeCity.printInhabitantNames();

		city.printInhabitantNames(); // Array out of bounds for nbInhabitants larger
		// than string length

		// String overflow = babyNameGenerator("BlehBaby", 500000000); // StackOverflow

		// city.printCityNameForEachInhabitant(); //infinite loop for negative number of
		// inhabitants
		System.out.println("Done");
	}
}
