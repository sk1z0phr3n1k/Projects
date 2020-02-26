/**
 *  Author: Mark Griffiths
 *  Date: 11/9/2019
 *  Purpose: Demonstrate the employee class and subclasses
 */

import java.util.Scanner;
public class GriffithsEmployeeDemo {

	public static void main(String[] args) {
		GriffithsProductionWorker emp1 = new GriffithsProductionWorker("Joe Momma", "999-F", "12/20/2019", 2, 45.0);
		GriffithsProductionWorker emp2 = getUserInput();
		GriffithsShiftSupervisor mark = new GriffithsShiftSupervisor("Mark Griffiths", "823-D", "09/10/2009", 125000.0);
		displayEmployees(emp1, emp2, mark);
		
	
	}
	
	
	/**
	 * Gets user input for populating Production worker fields
	 * returns ProductionWorker object
	 * @return
	 */
	public static GriffithsProductionWorker getUserInput() {
		Scanner keyboard = new Scanner(System.in);
		GriffithsProductionWorker temp = new GriffithsProductionWorker();
		
		System.out.println("****Enter a new Employee****\n\n");
		System.out.println("Enter Employee Name: ");
		temp.setName(keyboard.nextLine());
		System.out.println("Enter Employee ID#: ");
		
		/**
		 * calls getEmpID function for id number input
		 */
		temp.setID(getEmpID());
		System.out.println("Enter Date of Hire: ");
		temp.setHire(keyboard.nextLine());
		System.out.println("Enter Shift - [1]Day, [2]Night: ");
		temp.setShift(keyboard.nextInt());
		System.out.println("Enter hourly wage: ");
		temp.setWage(keyboard.nextDouble());
		
		keyboard.close();
		return temp;
	}
	
	/**
	 * Displays all employee information
	 */
	public static void displayEmployees(GriffithsProductionWorker emp1, GriffithsProductionWorker emp2, GriffithsShiftSupervisor emp3) {
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		emp3.calcBonus(emp1, emp2);
	}
	
	/**
	 * Gets Employee id number and verifies its in the correct form
	 * @return
	 */
	public static String getEmpID() {
		boolean isValid;
		Scanner keyboard = new Scanner(System.in);
		String idnumber;
		
		do {
		isValid = true;
		System.out.println("Enter in the form XXX-L, X = number L = letter:");
		idnumber = keyboard.nextLine();
		
		for(int i = 0; i < 3; i ++) {
			char ch = idnumber.charAt(i);
			if(!Character.isDigit(ch)) {
				isValid = false;
			}
		}
			
		for(int i = 3; i < 4; i ++) {
			char ch = idnumber.charAt(i);
			if(ch != '-') {
				isValid = false;
			}
		}
		
		for(int i = 4; i < 5; i ++) {
			char ch = idnumber.charAt(i);
			if(!Character.isLetter(ch)){
				isValid  = false;
			}
		}
		}while(!isValid);
		
		return idnumber;
	}
	
	

}



