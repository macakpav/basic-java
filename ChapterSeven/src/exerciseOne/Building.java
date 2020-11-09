package exerciseOne;

public class Building {
	
	int availableSpace;	
	String address;	
	static final String UNKNOWN_ADRESS="Unknown";
		
	public Building(int availableSpace, String address){
		this.setAvailableSpace(availableSpace);
		this.setAddress(address);
	}
	
	public Building(int availableSpace) {
		this(availableSpace,Building.UNKNOWN_ADRESS);
	}
	

	public int getAvailableSpace() {
		return availableSpace;
	}

	public void setAvailableSpace(int availableSpace) throws IllegalArgumentException {
		if (availableSpace>0) {
			this.availableSpace = availableSpace;
		} else {
			throw new IllegalArgumentException("Available space must be positive integer!");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "This is a building with " + getAvailableSpace() + " square meters of office space" 
				+ (getAddress().equals(Building.UNKNOWN_ADRESS) ? " with unknown address." 
						: " located at " + getAddress() + ".");
	}

	public static void main(String[] args) {
		Building first = new Building(12,"First");
		Building noAddress = new Building(50);
		
		System.out.println(first);
		System.out.println(noAddress);

	}

}
