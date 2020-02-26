/**
 * Threaded dice rolling for computer and player, determining winner from arrays
 * @author Mark Griffiths
 * 2.18.2020
 */


import java.util.Random;
public class DiceThreading {

	public static void main(String[] args) throws InterruptedException {
		Dice player = new Dice("Player");
		Dice computer = new Dice("Computer");

		player.start();
		displayRolls(player);

		computer.start();
		displayRolls(computer);

		displayWinner(player, computer);
	} // end main


	/**
	 * Accept Dice object and display results of rolls from array
	 * @param temp
	 */
	public static void displayRolls(Dice temp) {
		for(int i = 0; i < temp.getRolls().length; i ++) {
			System.out.println(temp.getName() + "s roll #" + (i+1) + ": " + temp.getRolls()[i]);
		}
		System.out.println("\nEnd thread " + temp.getName());
		System.out.println("===================================\n");
	} // end displayRolls

	/**
	 * Calculate and display player/computer wins, losses, and ties comparing arrays from both objects
	 * @param playerRolls
	 * @param computerRolls
	 */
	public static void displayWinner(Dice player, Dice computer) {
		int playerWins = 0;
		int computerWins = 0;
		int ties = 0;
		for(int i = 0; i < player.getRolls().length; i ++) {
			if(player.getRolls()[i] > computer.getRolls()[i]) {
				playerWins += 1;
			}
			else if(computer.getRolls()[i] > player.getRolls()[i]) {
				computerWins += 1;
			}
			else
				ties += 1;
		}

		System.out.println("Player Wins: " + playerWins + "\nComputer Wins: " + computerWins + "\nTies: " + ties);
	} // end displayWinner

} // end class

class Dice implements Runnable{

	Random roll = new Random();

	final private int[] _rolls = new int[1000];
	private Thread d;
	private String threadName;

	Dice(String name){
		threadName = name;
		System.out.println("Creating thread " + threadName);
	} // end Constructor

	public void start() {
		System.out.println("Starting " + threadName);
		if(d == null) {
			d = new Thread(this,threadName);
			d.start();
			try {
				d.join();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


	} // end start

	@Override
	public void run() {

		System.out.println("Running " + threadName);
		for(int i = 0; i < _rolls.length; i++) {
			int num = roll.nextInt(6) + 1;
			_rolls[i] = num;
		}

	} // end runnable

	public int[] getRolls() {
		return _rolls;
	}

	public String getName() {
		return threadName;
	}

} // end Dice class
