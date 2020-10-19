package exerciseThree;

public enum EmployeeType {
	CLERK (1000.),
	MIDLEVELMANAGER (2000.),
	CIO (3000.),
	CFO (3000.),
	CEO (5000.);
	
	private final double baseWage;

	EmployeeType(double baseWage) { //constructor
		this.baseWage=baseWage;
	}
	
	double baseWage() { //getter
		return baseWage;
	}
}