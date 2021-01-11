package r0829194;

import java.util.ArrayList;

public final class Laptop extends PortableDevice {

	private final String chassisMaterial; // matrial of chasis
	private final boolean mouseIncl; // comes with extra mouse
	private final boolean keyboardIncl; // comes with extra keyboard

	public Laptop(String infoSummary, String brand, double weight, double screenDiagonal,
			ArrayList<String> wirelessConnetions, String chassisMaterial, boolean mouseIncl, boolean keyboardIncl) {
		super(infoSummary, brand, weight, screenDiagonal, wirelessConnetions);
		this.chassisMaterial = chassisMaterial;
		this.mouseIncl = mouseIncl;
		this.keyboardIncl = keyboardIncl;
	}

	public String getChassisMaterial() {
		return chassisMaterial;
	}

	public boolean isMouseIncl() {
		return mouseIncl;
	}

	public boolean isKeyboardIncl() {
		return keyboardIncl;
	}

}
