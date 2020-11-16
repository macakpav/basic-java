package exerciseSeven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonScanner {

    public static void main(String[] args) {

	String directory = "src/exerciseSeven/";
	String[] fileNames = { directory + "person1.txt", directory + "person2.txt",
		directory + "person3.txt", directory + "person4.txt" };

	ArrayList<Person> list = new ArrayList<Person>();

	for (String fileName : fileNames) {
	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		String name = br.readLine();
		int age = Integer.parseInt(br.readLine());
		String location = br.readLine();
		Person person = new Person(name, age, location);
		if (!list.contains(person)) {
		    list.add(person);
		}
	    } catch (FileNotFoundException fnf) {
		System.out.println("File not found: " + fnf);
	    } catch (IOException io) {
		System.out.println("An error occurred: " + io);
	    }
	}

	// print out information in the list
	for (Person person : list) {
	    System.out.println(person.getName() + " (" + person.getAge() + ", "
		    + person.getLocation() + ")");
	}
    }
}
