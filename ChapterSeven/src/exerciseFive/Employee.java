package exerciseFive;

public abstract class Employee extends Person {
	private int employeeID;
	public Employee(String name, String gender, int employeeID) {
		super(name, gender);
		this.setEmployeeID(employeeID);
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public abstract int calculateSalary();
	
}
