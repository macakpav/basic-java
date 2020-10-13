package exerciseThree;

public class Employee {
	private EmployeeType employeeType;
	private int yearsAtCompany;

	Employee(EmployeeType employeeType, int yearsAtCompany) {
		this.employeeType = employeeType;
		this.yearsAtCompany = yearsAtCompany;
	}

	public double calculateWage() {
		return (employeeType.baseWage() * yearsAtCompany / 10.);
	}

	public static void main(String[] args) {
		Employee mark = new Employee(EmployeeType.CFO, 10);
		System.out.println(mark.calculateWage());
	}
}




