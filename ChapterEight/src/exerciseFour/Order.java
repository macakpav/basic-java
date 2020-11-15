/**
 * 
 */
package exerciseFour;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author Pavel Mačák
 *
 */
public class Order {
    private final int id;
    private final String customerName;
    private final int noBlueberry;
    private final int noChocolate;
    private final int noRedvelvet;

    public Order(int id, String customerName, int noBlueberry, int noChocolate,
	    int noRedvelvet) {
	this.id = id;
	this.customerName = customerName;
	this.noBlueberry = noBlueberry;
	this.noChocolate = noChocolate;
	this.noRedvelvet = noRedvelvet;
    }

    private String invoiceString() {
	return "Dear " + this.customerName + "," + System.lineSeparator()
		+ System.lineSeparator() + "we have received your order."
		+ System.lineSeparator() + System.lineSeparator()
		+ "Here is the summary and price of your order:"
		+ System.lineSeparator()
		+ (this.noBlueberry == 0 ? ""
			: this.noBlueberry + " Blueberry muffin"
				+ (this.noBlueberry > 1 ? "s" : ""))
		+ System.lineSeparator()
		+ (this.noChocolate == 0 ? ""
			: this.noChocolate + " Chocolate muffin"
				+ (this.noChocolate > 1 ? "s" : ""))
		+ System.lineSeparator()
		+ (this.noRedvelvet == 0 ? ""
			: this.noRedvelvet + " Red Velvet muffin"
				+ (this.noRedvelvet > 1 ? "s" : ""))
		+ System.lineSeparator() + System.lineSeparator()
		+ "Overall cost of this order is " + this.getCost() + " Euro."
		+ System.lineSeparator() + "Thank you for loving the Muffin Bakery!";
    }

    public double getCost() {
	return this.noBlueberry * MuffinType.BLUEBERRY.getPrice()
		+ this.noChocolate * MuffinType.CHOCOLATE.getPrice()
		+ this.noRedvelvet * MuffinType.RED_VELVET.getPrice();
    }

    private String invoiceFileName() {
	return this.id + "_" + this.customerName + ".inv";
    }

    @Override
    public String toString() {
	return "Order [id=" + this.id + ", customerName=" + this.customerName
		+ ", noBlueberry=" + this.noBlueberry + ", noChocolate="
		+ this.noChocolate + ", noRedvelvet=" + this.noRedvelvet + "]";
    }

    /**
     * @param folderPath
     */
    public void createInvoiceFile(String folderPath) {
	final String fileName = (folderPath.endsWith("/")
		? folderPath + this.invoiceFileName()
		: folderPath + "/" + this.invoiceFileName());

	try (Writer out = new FileWriter(fileName)) {
	    out.write(this.invoiceString());
	} catch (IOException io) {
	    System.out
		    .println("Error creating invoice file " + this.invoiceFileName());
	}

    }

}
