/**
 * 
 */
package exerciseFour;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

/**
 * @author Pavel Mačák
 *
 */
public class Order {
    private final int id;
    private final String customerName;
    private HashMap<MuffinType, Integer> orderedMuffins;

    public Order(int id, String customerName, int noBlueberry, int noChocolate,
	    int noRedvelvet) {
	this.id = id;
	this.customerName = customerName;
	this.orderedMuffins = new HashMap<MuffinType, Integer>();
	this.orderedMuffins.put(MuffinType.BLUEBERRY, noBlueberry);
	this.orderedMuffins.put(MuffinType.CHOCOLATE, noChocolate);
	this.orderedMuffins.put(MuffinType.RED_VELVET, noRedvelvet);
    }

    private String invoiceString() {
	int count;
	String invoice = "Dear " + this.customerName + "," + System.lineSeparator()
		+ System.lineSeparator() + "we have received your order."
		+ System.lineSeparator() + System.lineSeparator()
		+ "Here is the summary and price of your order:"
		+ System.lineSeparator() + System.lineSeparator();
	for (MuffinType muffin : MuffinType.values()) {
	    if (!this.orderedMuffins.containsKey(muffin))
		continue;
	    count = this.orderedMuffins.get(muffin);
	    invoice += (count == 0 ? ""
		    : count + " " + muffin.getName() + " muffin"
			    + (count > 1 ? "s" : ""))
		    + System.lineSeparator();

	}
	invoice += System.lineSeparator() + "Overall cost of this order is "
		+ this.getCost() + " Euro." + System.lineSeparator()
		+ "Thank you for loving the Muffin Bakery!";
	return invoice;
    }

    public double getCost() {
	double cost = 0;
	for (MuffinType muffin : MuffinType.values()) {
	    if (!this.orderedMuffins.containsKey(muffin))
		continue;
	    cost += muffin.getPrice() * this.orderedMuffins.get(muffin);
	}
	return cost;
    }

    private String invoiceFileName() {
	return this.id + "_" + this.customerName + ".inv";
    }

    @Override
    public String toString() {
	String str = "Order: id = " + this.id + ", customer name = "
		+ this.customerName;
	for (MuffinType muffin : MuffinType.values()) {
	    if (!this.orderedMuffins.containsKey(muffin))
		continue;
	    str += ", " + this.orderedMuffins.get(muffin) + " " + muffin.getName();
	}
	return str;
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
