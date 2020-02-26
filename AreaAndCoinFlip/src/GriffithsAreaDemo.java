/**
 * @author Mark Griffiths
 * Date: 10/24/2019
 * Purpose: Ask user for dimensions and display calculated area/volume from shape object
 */
import java.util.Scanner;
public class GriffithsAreaDemo {

	public static void main(String[] args) {
		
		
		calcAreas();
		
	
	
	}
	
	/**
	 * Display menu and ask user for selection returned as menuchoice, including validation. If anything other than 1-4 is chosen, display error and ask again
	 * @return
	 */
	public static int getMenuchoice() {
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("AREA CALCULATION");
		System.out.println("****************");
		System.out.println("* 1. Circle    *");
		System.out.println("* 2. Rectangle *");
		System.out.println("* 3. Cylinder  *");
		System.out.println("* 4. Quit      *");
		System.out.println("*              *");
		System.out.println("****************\n\n");
		

		System.out.println("Choose a Shape:[1][2][3]\nExit Program:[4]");
		int menuchoice = keyboard.nextInt();
		while(menuchoice < 1 || menuchoice > 4) {
			System.out.println("Error: Invalid selection.\n");
			System.out.println("Choose a Shape:[1][2][3]\nExit Program:[4]\n");
			menuchoice = keyboard.nextInt();
		}
		
		return menuchoice;
		
	}
	
	/**
	 * Take users menuchoice and print calculated area/volume to the console
	 * @param menuchoice
	 */
	public static void calcAreas() {
		Scanner keyboard = new Scanner(System.in);
		GriffithsShape shape = new GriffithsShape();
		int menuchoice;
		
		do {
		menuchoice = getMenuchoice();
		
		if(menuchoice == 1) {
			System.out.println("Enter the radius: ");
			System.out.printf("The area of the circle is %.2f\n ",shape.calcArea(keyboard.nextDouble()));
			}
		else if(menuchoice == 2) {
			System.out.println("Enter the length of the rectangle: ");
			int length = keyboard.nextInt();
			System.out.println("Enter the width of the rectangle: ");
			int width = keyboard.nextInt();
			System.out.println("The area of the rectangle is " + shape.calcArea(length,width) + "\n");
			}
		else if(menuchoice == 3) {
			System.out.println("Enter the radius of the cylinder: ");
			double radius = keyboard.nextDouble();
			System.out.println("Enter the height of the cylinder " );
			int height = keyboard.nextInt();
			System.out.printf("The volume of the cylinder is %.2f\n", shape.calcArea(radius, height));
		}
		else if(menuchoice == 4) {
			System.out.println("Thank you for using this program!");
		}
		}while(menuchoice != 4);
		keyboard.close();
	}

}
