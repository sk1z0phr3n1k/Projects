/**
 * 
 * @author Mark Griffiths
 * Date: 11/9/2019
 * Purpose: Create an employee Class 
 *
 */


public class GriffithsEmployee {
	String name;
	String employeeID;
	String hireDate;
	
	public GriffithsEmployee() {
		this.name = "Default";
		this.employeeID = "123-A";
		this.hireDate = "1/1/19";
	}
	
	public GriffithsEmployee(String name, String employeeID, String hireDate) {
		this.name = name;
		this.employeeID = employeeID;
		this.hireDate = hireDate;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return employeeID;
	}
	
	public String getHire() {
		return hireDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String empID) {	
		this.employeeID = empID;
	}
	
	public void setHire(String hireDate) {
		this.hireDate = hireDate;
	}
	
	public String toString() {
		String str = "";
		str += "Employee Name: " + this.name + "\n";
		str += "Employee ID: " + this.employeeID + "\n";
		str += "Date of Hire: " + hireDate + "\n";
		return str; 
	}

}
