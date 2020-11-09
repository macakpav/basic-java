package exerciseFive;

public class SalesPerson extends Employee {
	private int itemsSold;
	public SalesPerson(String name, String gender, int employeeID, int itemsSold) {
		super(name, gender, employeeID);
		this.setItemsSold(itemsSold);
	}
	
	public int getItemsSold() {
		return itemsSold;}
	public void setItemsSold(int itemsSold) {
		this.itemsSold = itemsSold;}

	@Override
	public int calculateSalary() {
		return this.getItemsSold()*10;
	}

}
