package r0829194;

import java.util.ArrayList;

public abstract class PortableDevice extends Device implements IPortable {
	private final double weight; // weight of device
	private final ArrayList<String> wirelessConnections; // list of wireless connections

	public PortableDevice(String infoSummary, String brand, double weight, double screenDiagonal,
			ArrayList<String> wirelessConnections) {
		super(infoSummary, brand, screenDiagonal);
		this.weight = weight;
		this.wirelessConnections = wirelessConnections;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public ArrayList<String> getWirelessConnections() {
		return wirelessConnections;
	}

}
