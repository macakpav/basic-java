/**
 * 
 */
package exerciseOne;

/**
 * @author Pavel Mačák
*
*/
import java.util.Scanner;

public class BMIProject {
    public static void main(String[] args) {
	// declare variables
	String name = new String();
	double weight = 60;
	double height = 1.70;
	double BMI;

	// Ask the user for inputs
	try (Scanner scan = new Scanner(System.in);) {
	    System.out.println("Please enter name");
	    name = scan.nextLine();
	    System.out.println("Please enter weight [kg]");
	    weight = scan.nextDouble();
	    System.out.println("Please enter height [m]");
	    height = scan.nextDouble();

	    // calculate BMI
	    BMI = calculateBMI(weight, height);

	    System.out.println(name.trim() + " weights " + weight + " kg and is "
		    + height + " m tall.");
	    System.out.println("The BMI is " + BMI);
	}

    }

    // method calculating BMI
    public static double calculateBMI(double w, double h) {
	double BMI;
	BMI = w / (h * h);
	return BMI;
    }

}