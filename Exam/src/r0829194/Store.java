package r0829194;

import java.util.ArrayList;
import java.util.HashMap;

public class Store {
	private final String storeName; // name of store
	private final HashMap<Device, Integer> inventoryMap; // map holding all Devices of this store (both portable and
															// not)

	public Store(String storeName) {
		super();
		this.storeName = storeName;
		inventoryMap = new HashMap<Device, Integer>();
	}

	public void addDevice(Device device) {
		assert (device != null);
		this.addDevice(device, 1);
	}

	public void addDevice(Device device, int timesToAdd) {
		assert (device != null);
		if (inventoryMap.containsKey(device)) {
			inventoryMap.replace(device, inventoryMap.get(device) + timesToAdd);
		} else {
			inventoryMap.put(device, timesToAdd);
		}

	}

	public void addDevice(ArrayList<Device> deviceList) {
		assert (deviceList != null);
		assert (deviceList.size() != 0);
		for (Device device : deviceList) {
			assert (device != null);
			this.addDevice(device);
		}
	}

	public void addPortableDevice(PortableDevice portableDevice) {
		assert (portableDevice != null);
		this.addDevice(portableDevice);
	}

	public void addPortableDevice(PortableDevice portableDevice, int timesToAdd) {
		assert (portableDevice != null);
		this.addDevice(portableDevice, timesToAdd);
	}

	public void addPortableDevice(ArrayList<PortableDevice> portableDevices) {
		assert (portableDevices != null);
		assert (portableDevices.size() != 0);
		this.addDevice(new ArrayList<Device>(portableDevices));
	}

	/**
	 * Retrieve description of devices from a certain manufacturer.
	 * 
	 * @param brandName name of the manufacturer (case insensitive)
	 * @return ArrayList of strings
	 */
	public ArrayList<String> retrieveDevices(String brandName) {
		ArrayList<String> stringList = new ArrayList<String>();

		for (Device device : inventoryMap.keySet()) {
			if (brandName.equalsIgnoreCase(device.getBrand())) {
				stringList.add(device.toString());
			}
		}
		return stringList;
	}

	public int getNumberOfDevices() {
		int count = 0;
		for (Integer c : inventoryMap.values()) {
			count += c;
		}
		return count;
	}

	public void clearInventory() {
		this.inventoryMap.clear();
	}

	@Override
	public String toString() {
		String portables = "";
		String devices = "";
		String temp;
		for (Device device : inventoryMap.keySet()) {
			temp = "\t" + device.toString() + ": " + this.inventoryMap.get(device) + System.lineSeparator();
			if (device instanceof IPortable) {
				portables += temp;
				continue;
			}
			devices += temp;
		}

		if (portables.equals("")) {
			portables = "none" + System.lineSeparator();
		}
		if (devices.equals("")) {
			devices = "none" + System.lineSeparator();
		}

		return this.storeName + System.lineSeparator() + "Devices in stock:" + System.lineSeparator() + devices
				+ "Portable devices in stock:" + System.lineSeparator() + portables;
	}

}
