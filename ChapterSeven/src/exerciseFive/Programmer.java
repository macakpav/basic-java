package exerciseFive;

public class Programmer extends Employee {
	private String favoriteProgrammingLanguage;
	private int linesOfCodeWritten;

	public Programmer(String name, String gender, int employeeID, String favoriteProgrammingLanguage,
			int linesOfCodeWritten) {
		super(name, gender, employeeID);
		this.setFavoriteProgrammingLanguage(favoriteProgrammingLanguage);
		this.setLinesOfCodeWritten(linesOfCodeWritten);
	}

	public String getFavoriteProgrammingLanguage() {
		return favoriteProgrammingLanguage;
	}

	public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage) {
		this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
	}

	public int getLinesOfCodeWritten() {
		return linesOfCodeWritten;
	}

	public void setLinesOfCodeWritten(int linesOfCodeWritten) {
		this.linesOfCodeWritten = linesOfCodeWritten;
	}

	@Override
	public int calculateSalary() {
		return 10000 + this.getLinesOfCodeWritten() * (this.getFavoriteProgrammingLanguage().equals("Java") ? 2 : 1);
	}
}
