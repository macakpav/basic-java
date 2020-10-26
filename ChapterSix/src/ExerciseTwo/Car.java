package ExerciseTwo;

public class Car {
	String brand;
	double fuelConsumption;

	// constructor method
	public Car(String brand, double fuelConsumption) {
		this.brand = brand;
		this.fuelConsumption = fuelConsumption;
	}

	// methods to return brand and fuelConsumption
	public String getBrand() {
		return brand;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}
}