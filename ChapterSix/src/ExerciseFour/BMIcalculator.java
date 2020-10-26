package ExerciseFour;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMIcalculator {

	// method calculating BMI
	public static double calculateBMI(double weight, double height) throws InputMismatchException {
		double BMI;
		if (weight <= 0 || height <= 0) {
			throw new InputMismatchException("Weight and height have to be positive!");
		} else if (weight > 250.0 || height > 3.0) {
			throw new InputMismatchException("Weight and height values out of reasonable bounds! Input correct units.");
		}
		BMI = weight / (height * height);
		return BMI;
	}

	// Main method

	public static void main(String[] args) {
		// declare variables
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Please enter your weight in kilograms: ");
			double weight = scan.nextDouble();
			System.out.println("Please enter your height in centimeters: ");
			double height = scan.nextDouble() / 100.;
			// calculate BMI
			double BMI = calculateBMI(weight, height);
			// print to screen
			System.out.println("Your BMI is " + BMI + ".");

		} catch (InputMismatchException ex) {
			System.out.println("Please provide a valid input!");
			if (ex.getMessage() != null) {
				System.out.println(ex.getMessage());
			}
		} finally {
			scan.close();
		}

	}

}
