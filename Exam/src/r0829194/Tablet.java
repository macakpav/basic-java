package r0829194;

import java.util.ArrayList;

public final class Tablet extends PortableDevice {
	private final boolean stylusIncl; // comes with a stylus
	private final double caseWeight; // weight of accompanying case

	public Tablet(String infoSummary, String brand, double weight, double screenDiagonal,
			ArrayList<String> wirelessConnections, boolean stylusIncl, double caseWeight) {
		super(infoSummary, brand, weight, screenDiagonal, wirelessConnections);
		this.stylusIncl = stylusIncl;
		this.caseWeight = caseWeight;
	}

	public boolean isStylusIncl() {
		return stylusIncl;
	}

	@Override
	public double getWeight() {
		return super.getWeight() + this.caseWeight;
	}
}
