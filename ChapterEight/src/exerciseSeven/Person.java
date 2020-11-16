package exerciseSeven;

public class Person {

    private String name;
    private int age;
    private String location;

    public Person(String name, int age, String location) {
	this.name = name.trim();
	this.age = age;
	this.location = location.trim();
    }

    public String getName() {
	return this.name;
    }

    public int getAge() {
	return this.age;
    }

    public String getLocation() {
	return this.location;
    }

    @Override
    public boolean equals(Object obj) {
	if (!(obj instanceof Person))
	    return false;
	if (!this.name.equals(((Person) obj).name))
	    return false;
	if (this.age != ((Person) obj).age)
	    return false;
	if (!this.location.equals(((Person) obj).location))
	    return false;
	return true;
    }

}