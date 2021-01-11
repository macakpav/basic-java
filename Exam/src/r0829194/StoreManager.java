package r0829194;

import java.util.ArrayList;

/*
 * Nothing inside the class StoreManager may be changed for the purpose of exam.
*/

public class StoreManager {

	public static void main(String[] args) {

		Store localStore = new Store("Electronics Inc.");

		// create desktop computers
		DesktopComputer modelOne = new DesktopComputer("Acer Aspire TC-895 I7510", "Acer", 8, 16, 24, 1);
		DesktopComputer modelTwo = new DesktopComputer("MSI MEG Infinite X 10SD-661MYS", "MSI", 8, 16, 27, 2);
		DesktopComputer modelThree = new DesktopComputer("Apple iMac 27 inch Intel Core i7", "Apple", 18, 32, 27, 1);

		// add desktop computers to store
		ArrayList<Device> desktopList = new ArrayList<Device>();
		desktopList.add(modelTwo);
		desktopList.add(modelThree);

		localStore.addDevice(modelOne);
		// add 5 more modelOne devices to the inventory
		localStore.addDevice(modelOne, 5);
		localStore.addDevice(desktopList);

		// create laptop connections
		ArrayList<String> laptopConnections = new ArrayList<String>();
		laptopConnections.add("Wifi");
		laptopConnections.add("Bluetooth");
		// create laptops
		Laptop laptopModelOne = new Laptop("Apple MacBook Pro 16 inch Touch Bar Silver", "Apple", 2.0, 16.0,
				laptopConnections, "aluminum", false, false);
		Laptop laptopModelTwo = new Laptop("HP 14s-dq1031nb", "Hewlett Packard", 2.78, 17.3, laptopConnections,
				"plastic", false, false);
		Laptop laptopModelThree = new Laptop("Lenovo IdeaPad L340-17IRH 81LL003EMB", "Lenovo", 1.46, 14.0,
				laptopConnections, "plastic", false, false);

		// create laptop connections
		ArrayList<String> tabletConnections = new ArrayList<String>();
		tabletConnections.add("Wifi");
		tabletConnections.add("Bluetooth");
		tabletConnections.add("5G");
		// create tablets
		Tablet tabletModelOne = new Tablet("Samsung Galaxy Tab A7 64GB Wifi", "Samsung", 0.472, 10.4, tabletConnections,
				false, 0.505);
		Tablet tabletModelTwo = new Tablet("Apple iPad Pro 12.9 inch 128 GB Wifi Space Gray + Pencil 2", "Apple", 0.641,
				12.9, tabletConnections, true, 0.349);

		// add laptops and tablets to store
		ArrayList<PortableDevice> portableDevices = new ArrayList<PortableDevice>();
		portableDevices.add(laptopModelOne);
		portableDevices.add(tabletModelOne);

		localStore.addPortableDevice(portableDevices);
		localStore.addPortableDevice(laptopModelTwo);
		// add 5 laptopModelThree portable devices to the inventory
		localStore.addPortableDevice(laptopModelThree, 5);
		// add 1 tabletModelTwo device to the inventory
		localStore.addPortableDevice(tabletModelTwo, 1);

		// print the inventory of the store
		System.out.println(localStore);

		// print total number of items in store
		System.out.println("Number of devices in store: " + localStore.getNumberOfDevices() + "\n");

		// print all Apple device models from store
		ArrayList<String> result = localStore.retrieveDevices("Apple");
		System.out.println("Apple devices in store:");
		for (String item : result) {
			System.out.println(item);
		}
		System.out.println();

		// clear out the entire inventory
		localStore.clearInventory();

		// print the inventory of the store
		System.out.println(localStore);

	}

}
