/**
 * 
 */
package exerciseFour;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Pavel Mačák
 *
 */
public class OrderList implements Iterable<Order> {

    ArrayList<Order> orders;
    int noOrders;

    public OrderList() {
	this.orders = new ArrayList<Order>();
	this.noOrders = 0;
    }

    @Override
    public Iterator<Order> iterator() {
	return this.orders.iterator();
    }

    public void addOrder(String customerName, int noBlueberry, int noChocolate,
	    int noRedvelvet) {
	this.orders.add(new Order(this.noOrders, customerName, noBlueberry,
		noChocolate, noRedvelvet));
	this.noOrders++;
    }

    /**
     * @return the number of orders
     */
    public int getNoOrders() {
	return this.noOrders;
    }

    public void generateInvoices(String folderPath) {
	for (Order order : this.orders) {
	    order.createInvoiceFile(folderPath);
	}
    }

    @Override
    public String toString() {
	String retValue = "Order list:\n";
	for (Order order : this.orders) {
	    retValue += order.toString() + "\n";
	}
	return retValue;
    }

}
