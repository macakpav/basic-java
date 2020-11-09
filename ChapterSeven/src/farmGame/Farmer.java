package farmGame;

public class Farmer extends Person{

	Ownable[] property;
	
	public Farmer(String name, boolean gender, Ownable[] property) {
		super(name, gender);
		this.setProperty(property);
	}
	public Farmer(String name, boolean gender) {
		this(name, gender, null);
	}
	public void setProperty(Ownable[] property) {
		this.property=property;
	}
	
	
}
