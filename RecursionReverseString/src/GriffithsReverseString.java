/**
 * @author Mark Griffiths
 * Date: 1/22/2020
 * Class: CSC251
 * Use recursion to reverse a string
 */

import java.util.Scanner;

public class GriffithsReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of text, nothing fancy: ");
		String userString = input.nextLine();
		System.out.print(flipString(userString));


	} //end main

	public static String flipString(String userString) {
		if (userString.isEmpty()) {
			return userString;
		}
		return flipString(userString.substring(1)) + userString.charAt(0);

	} //end flipString

} //end class
