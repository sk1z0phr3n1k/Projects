/**
 * 
 * @author Mark Griffiths
 * Date 11/9/2019
 * Purpose: Create a shift supervisor from the employee base class
 *
 */
public class GriffithsShiftSupervisor extends GriffithsEmployee {
	double salary;
	
	public GriffithsShiftSupervisor() {
		super();
		this.salary = 75000.0;
	}
	
	public GriffithsShiftSupervisor(String name, String employeeID, String hireDate, double salary) {
		super(name, employeeID, hireDate);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		String str = super.toString();
		str += "Salary: " + String.format("$%.2f", this.salary);
		return str;
	}
	
	
	/**
	 * Calculates and displays supervisor bonus if applicable
	 * @param emp1
	 * @param emp2
	 */
	public void calcBonus(GriffithsProductionWorker emp1, GriffithsProductionWorker emp2) {
		double bonus;
		if(emp1.getShift() == emp2.getShift()) {
			System.out.printf("Same Shift Bonus:  $%.2f", (this.salary * 0.08));
		}
		else {
			System.out.println("No Bonus");
		}
		
		
	}
}
