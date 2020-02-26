/**
 * 
 * @author Mark Griffiths
 * Date: 10/24/2019
 * Purpose: Create a shape object that calculates the area of a circle, rectangle, cylinder
 */
public class GriffithsShape {
	
	/**
	 * Accept double radius and return area
	 * @param radius
	 * @return
	 */
	public double calcArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	
	/**
	 * Accept int length and width and return area
	 * @param length
	 * @param width
	 * @return
	 */
	public int calcArea(int length, int width) {
		return length * width;
	}
	
	
	/**
	 * Accept double radius and int height and return volume of cylinder
	 * @param radius
	 * @param height
	 * @return
	 */
	public double calcArea(double radius, int height) {
		return (Math.PI * radius * radius) * height;
	}

}
