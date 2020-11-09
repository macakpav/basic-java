package farmGame;

public class Control {

	public static void main(String[] args) {
		Pig myPig = new Pig("Pepina", 54);
		Dog myDog = new Dog("Phineas", 12);
		Cow myCow = new Cow("Marry", 200);
		Animal[] herd = new Animal[] {myPig, myDog, myCow};
		
		
		
		for (int day = 1; day <= 7; day++) {
			newDay(herd, day);
			for (Animal animal : herd) {
				animal.printStatus();
			}
			for (Animal animal : herd) {
				animal.feed();
				animal.grow();
				System.out.println();
			}
		}

	}
	
	public static void newDay(Animal[] animals, int day) {
		for (int i = 0; i < animals.length; i++) {
			animals[i].newDay();
		}
		System.out.println();
		System.out.println("Its a new day" + (day==0? "" : " number " + day ) + "!");
	}
	
	public static void newDay(Animal[] animals) {
		newDay(animals,0);
	}

}
