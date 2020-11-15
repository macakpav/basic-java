/**
 * 
 */
package exerciseThree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Change the program in Exercise 2 so it asks the user for a filename which
 * contains numbers (it should be stored in the src folder or one of the
 * existing packages) and then writes their average at the end of the same file.
 * Implement it to catch possible exceptions.
 * 
 * @author Pavel Mačák
 *
 */
public class FileAverage {
    static int noInputs;
    static double number, sum;
    static FileInputStream file;

    public static void main(String[] args) {
	noInputs = 0;
	sum = 0;
	System.out.println(
		"This programs ask for file name and prints average of the numbers there.");
	try (Scanner scan = new Scanner(System.in);) {
	    while (true) {
		System.out.println("Please give the file name: ");
		try {
//		    file = new FileInputStream(scan.next());
		    file = new FileInputStream("src/exerciseThree/averageInput.txt");
		    break;
		} catch (FileNotFoundException ex) {
		    System.out.println("Please give a valid file name.");
		}
	    }
	}

	try (Scanner scanFile = new Scanner(file)) {
	    do {
		try {
		    number = scanFile.nextDouble();
		    System.out.println(number);
		    if (number == 0) {
			break;
		    }
		    sum += number;
		    noInputs++;
		} catch (InputMismatchException io) {
		    System.out.println("There is an ivalid entry '" + scanFile.next()
			    + "' in given file");
		}
	    } while (scanFile.hasNext());

	}

	if (noInputs > 0) {
	    System.out.println("Average of numbers is " + sum / noInputs);
	} else {
	    System.out.println("No valid input given.");
	}

    }
}
