package farmGame;

import java.util.ArrayList;

public class Herd {

	private ArrayList<Animal> animals;
	
	public Herd(Animal[] animals) {
		this.animals = new ArrayList<Animal>();
		for (int i = 0; i < animals.length; i++) {
			this.animals.add(animals[i]);
		}
	}
	
	public Herd(Animal animal) {
		this(new Animal[] {animal});
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public int herdSize() {
		return (animals != null ? animals.size(): 0);
	}
}
