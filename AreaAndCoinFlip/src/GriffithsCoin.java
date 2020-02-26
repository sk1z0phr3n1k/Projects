/**
 * 
 * @author Mark Griffiths
 * Date: 10/26/2019
 * Purpose: Create a coin object for a heads or tails guessing game that returns a 
 * random side out of two sides
 */

import java.util.Random;
public class GriffithsCoin {

	/**
	 * return a random number between 1 and 2
	 * @return
	 */
	public int flipCoin() {
		Random flip = new Random();
		
		int num = flip.nextInt(2) + 1;
		return num;
	}
	
	
}
