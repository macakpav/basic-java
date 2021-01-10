/**
 *  
 */
package exerciseFour;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Pavel Macak
 *
 */
public class MuffinBakery {
	OrderList orders;
	final static int noMuffinTypes = MuffinType.values().length;

	public MuffinBakery() {
		this.orders = new OrderList();
	}

	public static void main(String[] args) {
		MuffinBakery myBakery = new MuffinBakery();
		if (myBakery.readOrderFile("src/exerciseFour/orders.txt")) {
			System.out.print(myBakery);
			myBakery.generateInvoces("src/exerciseFour/Invoices/");
		}
	}

	public boolean readOrderFile(String fileName) {
		try (FileInputStream file = new FileInputStream(fileName)) {

			try (Scanner scan = new Scanner(file)) {
				while (scan.nextLine().trim().equals("")) {
					// skip empty lines
				}
				String line;
				String[] buf;
				int[] counts = new int[noMuffinTypes];
				while (scan.hasNextLine()) {
					line = scan.nextLine().trim();
					if (line.equals(""))
						continue;
					buf = line.split(",");
					if (buf.length != 1 + noMuffinTypes)
						throw new InputMismatchException(
								"Line has wrong format: " + line);
					for (int i = 1; i < buf.length; i++) {
						try {
							counts[i - 1] = Integer.parseUnsignedInt(buf[i].trim());
						} catch (NumberFormatException ex) {
							throw new InputMismatchException(
									"Invalid entry in file. Expected integer, got:"
											+ buf[i]);
						}
					}
					this.orders.addOrder(buf[0].trim(), counts);

				}
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the file " + fileName + "!");
		} catch (IOException e) {
			System.out.println("Error trying to open file " + fileName + "!");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			System.out.println("Error reading file " + fileName + "!");
		}
		return false;
	}

	public void generateInvoces(String folderPath) {
		this.orders.generateInvoices(folderPath);
		return;
	}

	@Override
	public String toString() {
		return "MuffinBakery:\n" + this.orders;
	}

}

/*
 * The Muffin Bakery sells three types of muffins: blueberry, chocolate and red
 * velvet and they cost 3 Euro, 2.50 Euro and 3.50 Euro, respectively. The
 * muffins can be ordered online the day before and each morning the list of
 * orders is read into the system (from a file called orders.txt; see below).
 * The system keeps track of how many cupcakes of each type have been ordered,
 * prints these numbers to the screen in addition to creating an invoice for
 * each customer, with the total cost of the order. All invoices are stored in a
 * folder called Invoices. You job is to create the system. Write a class called
 * MuffinBakery that keeps count of numbers of muffins and calculates the cost
 * of the orders. In the main method, read the list of orders, print the total
 * number of each type of muffin to the screen and create the invoices. The list
 * of orders is stored in the file orders.txt and has the fixed form (so that
 * you can make use of a Scanner object): Name, Number of Blueberry, Number of
 * Chocolate, Number of Red Velvet Maria, 5,2,4 Tim 0,10,2 Etc. Additional part
 * of the exercise: add amounts of whitespace to the orders.txt file and run
 * your program again to see if it still works; if not, make the necessary
 * changes. Alternative exercise: make use of Javas StringTokenizer class to
 * write this application; you can find the API here (focus on the Token
 * methods, not the Element methods):
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/
 * StringTokenizer.html
 *
 */