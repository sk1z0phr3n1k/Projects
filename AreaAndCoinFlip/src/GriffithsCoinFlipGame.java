/**
 * @author Mark Griffiths
 * Date: 10/26/2019
 * Purpose: Create a game where the user has to guess which side heads or tails will come
 * up from a coin toss. Add 1 point with a correct guess, subtract 1 if incorrect. 10 points
 * wins.
 */


import java.util.Scanner;
public class GriffithsCoinFlipGame {

	public static void main(String[] args) {
		
		flipGame();

	}
	
	
	
	
	
	
	/**
	 * Display menu and get heads or tails from the user return as int
	 * @return
	 */
	public static int pickSide() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\n\n    Pick heads or tails, if your side comes up, you win!");
		System.out.println("     Two points for a win, lose a point if you lose!");
		System.out.println("               10 points wins the game!");
		System.out.println("\n             Choose a side and flip the coin!");
		System.out.println("           *********************************");
		System.out.println("\n                       1. Heads");
		System.out.println("                       2. Tails");
		
		int side = keyboard.nextInt();
		while(side < 1 || side > 2) {
			System.out.println("Coins have 2 sides! Better pick again!");
			side = keyboard.nextInt();
			keyboard.close();
		}
		
		return side;
	}
	
	
	
	
	/**
	 * Set int as string heads or tails, flip coin compare user side, if it matches
	 * increment number of flips and add to player score, subtract from score for
	 * a loss. Display running score, and rounds at the end.
	 */
	public static void flipGame() {
		GriffithsCoin coin = new GriffithsCoin();
		int playerScore = 0;
		int numFlips = 0;
		String guess = "";
		String coinSide = "";
		
		while(playerScore < 10) {
			int side = pickSide();
			int headsTails = coin.flipCoin();
				if(side == 1) {
					guess = "heads";
					}
				else if(side == 2) {
					guess = "tails";
					}
		
				if(headsTails == 1) {
					coinSide = "heads";
					}
				else {
					coinSide = "tails";
					}
		
	
				if(side == headsTails) {
					System.out.println("\nYou win! You guessed " + guess + " and the coin came up " + guess + "! You get 2 points!");
					playerScore += 2;
					numFlips ++;
					}
				else {
					System.out.println("You guessed " + guess + " and lost! The coin came up " + coinSide + "! You lose a point!");
					playerScore--;
					numFlips++;
					}
		
		System.out.println("\n\n             You scored a total of " + playerScore + " points!");
		}
		
		System.out.println("\n             You took " + numFlips + " flips to score 10 points!");
		
	}

}
