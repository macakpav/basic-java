/**
 * 
 */
package exerciseTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that asks the user to enter numbers until he enters 0 and
 * then calculates the average of the numbers. Implement it to catch possible
 * exceptions.
 * 
 * @author Pavel Mačák
 *
 */
public class ConsoleAverage {
    static int noInputs;
    static double number, sum;

    public static void main(String[] args) {
	noInputs = 0;
	sum = 0;
	System.out.println(
		"This programs ask for numbers and prints their average after the number 0 is given.");
	try (Scanner scan = new Scanner(System.in);) {
	    do {
		try {
		    System.out.print("Please insert a number: ");
		    number = scan.nextDouble();
		    if (number == 0) {
			break;
		    }
		    sum += number;
		    noInputs++;
		} catch (InputMismatchException io) {
		    System.out.println("Please give a number. Put 0 to finish");
		    scan.next();
		}
	    } while (true);
	}
	if (noInputs > 0) {
	    System.out.println("Average of numbers is " + sum / noInputs);
	} else {
	    System.out.println("No valid input given.");
	}

    }

}
