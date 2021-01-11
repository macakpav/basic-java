package r0829194;

public abstract class Device {

	private final String infoSummary; // summary of the device
	private final String brand; // brand of device
	private final double screenDiagonal; // diagonal of screen

	public Device(String infoSummary, String brand, double screenDiagonal) {
		super();
		this.infoSummary = infoSummary;
		this.brand = brand;
		this.screenDiagonal = screenDiagonal;
	}

	public String getBrand() {
		return brand;
	}

	public double getScreenDiagonal() {
		return screenDiagonal;
	}

	@Override
	public String toString() {
		return infoSummary;
	}

}
