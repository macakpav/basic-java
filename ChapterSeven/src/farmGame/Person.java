package farmGame;

public class Person {

	private String name;
	private boolean gender;
	public static final boolean MALE = true;
	public static final boolean FEMALE = false;
	
	public Person(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setGender(String gender) throws IllegalArgumentException {
		
		if (gender.toLowerCase().matches("man|male|boy|guy")) {
			this.gender=Person.MALE;
		} else if (gender.toLowerCase().matches("woman|female|girl")) {
			this.gender=Person.FEMALE;
		} else {
			throw new IllegalArgumentException("Unrecognized gender string: " + gender);
		}
		
	}

}
