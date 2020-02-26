/**
 * Customer test program
 * @author Mark Griffiths
 * CSC251
 * 2/8/2020
 *
 */

import java.util.Scanner;
public class GriffithsCustomerTest {
	
	public static void main(String[] args) {
		
		
		
		displayCustomer(setCustomer());
		
		

	} // end main
	
	/**
	 * Creates and returns PreferredCustomer Object from user input
	 * @return
	 */
	public static GriffithsPreferredCustomer setCustomer() {
		Scanner input = new Scanner(System.in);
		GriffithsPreferredCustomer temp = new GriffithsPreferredCustomer();
		
		System.out.println("Please enter your name: ");
		temp.setName(input.nextLine());
		
		System.out.println("\nPlease enter your address: ");
		temp.setAddress(input.nextLine());
		
		System.out.println("\nPlease enter your phone number: ");
		temp.setPhoneNumber(input.nextLine());
		
		System.out.println("\nPlease enter your customer number: ");
		temp.setCustomerNumber(input.nextLine());
		
		System.out.println("\nPlease enter your purchase amount: ");
		temp.setPurchases(input.nextDouble());
		
		System.out.println("\nWould you like to be on the mailing list? ");
		System.out.println("\n[1] Yes");
		System.out.println("[2] No\n\n");
		
		temp.setMailingList(input.nextInt());
		input.close();
		
		return temp;
		
	} // end setCustomer
	
	
	/**
	 * Accepts PreferredCustomer Object as argument and  displays output
	 * @param temp
	 */
	public static void displayCustomer(GriffithsPreferredCustomer temp) {
		
		System.out.println("===================================");
		System.out.println("       CUSTOMER INFORMATION        ");
		System.out.println("===================================\n");
		System.out.println(temp);
		
	} // end displayCustomer

} // end class
