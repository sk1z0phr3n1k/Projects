/**
 * 
 * @author Mark Griffiths
 * Date: 11/9/2019
 * Purpose: to Create a Production Worker of the employee class
 *
 */


public class GriffithsProductionWorker extends GriffithsEmployee{
	int shift;
	double hourlyWage;
	
	
	public GriffithsProductionWorker() {
		super();
		this.shift = 1;
		this.hourlyWage = 15.00;
	}
	
	public GriffithsProductionWorker(String name, String employeeID, String hireDate, int shift, double hourlyWage) {
		super(name, employeeID, hireDate);
		this.shift = shift;
		this.hourlyWage = hourlyWage;
	}
	
	
	/**
	 * Getter and Setter functions
	 * @return
	 */
	
	public int getShift() {
		return shift;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	public void setShift(int shift) {
		this.shift = shift;
	}
	
	public void setWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	
	/**
	 * ToString function for printing information
	 */
	public String toString() {
		String str = super.toString();
		if(this.shift == 1) {
			str += "Shift: Day\n";
		}
		else {
			str += "Shift: Night\n";
		}
		str += "Hourly Wage: " + String.format("$%.2f", this.hourlyWage) + "\n";
		return str;
	}
}
