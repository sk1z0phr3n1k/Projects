/**
 * @author Mark Griffiths
 * Date 11/3/2019
 * CSC151
 * Purpose: to verify a string meets password requirements and test strength
 */

import javax.swing.JOptionPane;
public class GriffithsPasswordVerifier {

	public static void main(String[] args) {
		
		verifyPassword();

	}
	
	
	/**
	 * Gets user password string
	 * @return
	 */
	public static String getPassword() {
		String password = JOptionPane.showInputDialog("Your new password must be at least 6 characters long, contain at least 1 uppercase and 1 lowercase letter,"
				+ " at least 1 digit, and a special character (!@#$% for example). \nEnter your new password: ");
		return password;
	}
	
	
	/**
	 * Tests validity of password string and displays acceptable, strong, or invalid and reasons for invalid
	 */
	public static void verifyPassword() {
		boolean isValid = true; 
		
		do {
		int upperCase = 0, lowerCase = 0, digit = 0, symbol = 0;
		String password = getPassword();
	
		for(int i = 0; i <  password.length(); i ++) {
			char ch = password.charAt(i);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
				upperCase += 1;
				}
				else {
					lowerCase += 1;
				}
			}
			else if(Character.isDigit(ch)) {
				digit += 1;
			}
			else {
				symbol += 1;
			}
		}
		
		if(password.length() < 6 || upperCase < 1 || lowerCase < 1 || digit < 1 || symbol < 1) {
			isValid = false;
			System.out.println("This password is invalid for the following reasons: ");
			if(password.length() < 6) {
				System.out.println("-less than 6 characters long");
			}
			if(upperCase < 1) {
				System.out.println("-contains no uppercase letters");
			}
			if(lowerCase < 1) {
				System.out.println("-contains no lowercase letters");
			}
			if(digit < 1) {
				System.out.println("-contains no digits");
			}
			if(symbol < 1) {
				System.out.println("-contains no symbols");
			}
			
		}
		else {
			isValid = true;
			System.out.print("This password is ACCEPTABLE");
			if(password.length() >= 10 && symbol > 1) {
				System.out.print(" and this password is STRONG");
			}
		}	
	}while(!isValid);
	}

}
