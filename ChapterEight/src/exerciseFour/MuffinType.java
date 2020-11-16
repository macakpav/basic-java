/**
 * 
 */
package exerciseFour;

/**
 * @author Pavel Mačák
 *
 */
public enum MuffinType {
    BLUEBERRY("Blueberry", 3),
    CHOCOLATE("Chocolate", 2.5),
    RED_VELVET("Red Velvet", 3.5),
    MARSHMALLOW("Marshmallow", 4);

    private String name;
    private double price;

    private MuffinType(String name, double price) {
	this.name = name.trim();
	this.price = price;
    }

    /**
     * @return the name of muffin
     */
    protected String getName() {
	return this.name;
    }

    /**
     * @return the price of muffin
     */
    protected double getPrice() {
	return this.price;
    }

}
