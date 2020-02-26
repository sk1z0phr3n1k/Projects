/**
 * Date: 11/20/2019
 * @author Mark Griffiths
 * Class: CSC151
 * Purpose: Main game class, handles instances of objects, exceptions, etc.
 *
 */


import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.io.*;


public class GriffithsGame {

	public static void main(String[] args) {
		GriffithsPlayerCharacter player = new GriffithsPlayerCharacter();
		boolean gameOver = false;
	

		do {
		if(!gameOver) {
			if(gameStartMenu()) {
			 player = createPlayerCharacter(characterCreation());
			 playGame(player);
			 if(player.getHealth() <= 0) {
				 gameOver = true;
			 }
			}
			else
				gameOver = true;
		}
		}while(!gameOver);
		printPlayer(player);
		
	}
	
	/**
	 * Presents game menu, returns true if playing the game, false if not
	 * @return
	 */
	public static boolean gameStartMenu() {
		String userInput;
		int menuChoice = 0;
		boolean playGame = false;
		
		do {
		menuChoice = 0;
			try {
				userInput = JOptionPane.showInputDialog("                     So, you want to play a game. Do you really want to play a game?\n"
					+ "Tic Tac Toe is pretty cool. No? I didn't think so! I think I know the kind of game you want to play.\n"
					+ "You want to play a game that has it all. Action, adventure, brutality, a game where quick wits will serve\n"
					+ "no purpose whatsoever and the outcome is utterly insane and random! Where your actions \nserve only to "
					+ "amuse you, and glory awaits! Cool, I got you, lets do this.\n\n"
					+ "          [1] Play the game\n"
					+ "          [2] PLAY THE GAME (also play the game, but number 2, AND IN CAPS)\n"
					+ "          [3] Don't play the game (Why would you pick this one?)\n"
					+ "          [4] Quit, its almost like not playing the game");
			
				menuChoice = Integer.parseInt(userInput);
				if(menuChoice == 3) {
					throw new GriffithsMenuChoiceException(menuChoice);
				}
				else if(menuChoice <=0 || menuChoice > 4) {
					JOptionPane.showMessageDialog(null, "Really? 1 through 4, thats all I've got.");
				}
			}
		
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Well, you have 4 choices, try it one more time.");
			}
			catch(GriffithsMenuChoiceException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
			
		}while(menuChoice <= 0 || menuChoice > 4 || menuChoice == 3);
		
		try {
		if(menuChoice == 1) {
				playGame = true;
		}
		else if(menuChoice == 2) {
			JOptionPane.showMessageDialog(null,"This is so much better than number 1 even though its totally the same thing.");
				playGame = true;
		}
		else if(menuChoice == 4) {
			JOptionPane.showMessageDialog(null, "Hey, thanks for playing! Sort of.");
		}
		}
		catch(IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Really, what was the point of that?");
		}
		return playGame;
	}
	
	/**
	 * Main game play method, accepts Character, calls encounters, ends if player health reaches 0 and player dies
	 * @param player
	 * @return
	 */
	public static GriffithsPlayerCharacter playGame(GriffithsPlayerCharacter player) {
		boolean gameOver = false;
		
		System.out.println("You awake in a cave, because thats where you live. You never paid your rent so you got kicked out of \n"
				+ "your sweet pad. You stumble out of the cave in a haze. Laying your eyes on the blasted, yet awesome and glorious \n"
				+ "wasteland you call home. Chrome as far as the eye can see, skulls spewing fire while ambiant heavy guitar riffs waft \n"
				+ " through the air from some unseen source. Truly a paradise! Your days are full of fighting and glory, and your \n"
				+ "nights are filled with feasting, drinking, and indulging all your excesses, which are many and varied. Truly you \n"
				+ " have an excess of excesses. You are pretty cool.\n\n"
				+ "Yet, all is not as cool as it appears. You awoke because someone was banging on the outside of your cave, since \n"
				+ "you don't own a door because you're broke and doors are for the weak.\n"
				+ "Your vision is still a little blurry from whatever you got up to last night.");
				player = encounterOne(player);
				if(player.getHealth() <= 0) {
					gameOver = true;
				}
		if(gameOver == false) {		
		System.out.println("\n Not a bad way to start the day. You could have used a little more beauty sleep but you feel \n"
				+ "pretty good after that exhilarating if pointless encounter. But you excel at pointless encounters, you\n"
				+ "could even say your life up until now has been one long string of pointless yet awesome encounters. Stumbling\n"
				+ "out the door and away from the glorious mess you left in your wake, you hear a scream off in the distance.\n"
				+ "You dig screaming. You scream. You hear the scream again. You scream one more time. There's that scream again!\n"
				+ "You scream one last time before off in the distance you hear 'Are you going to help or what?' Apparantly \n"
				+ "this wasn't a competition. You leisurely jog-walk down the path of sunbleached bones that sold you on this \n"
				+ "property in the first place, and find the source of the screaming. A breathtaking sight stands before you. \n"
				+ "Is it gold? Is it diamonds? No, it's a giant screaming woman. Just your type. Violent, clad in as little as\n"
				+ "possible, and ready to kill! Mainly because her wicked sweet space hog broke down.\n\n");
				player = encounterTwo(player);
				if(player.getHealth() <= 0) {
					gameOver = true;
				}
				
		}
		if(gameOver == false) {
			System.out.println("\nThis seems like an awfully eventful stroll just to drink beer from the skulls of your enemies.\n"
					+ "Fortunately, you see the awe inpsiring and deeply relaxing sight of the entrance to your favorite \n"
					+ "drinking den. Horned skulls emblazoning the entryway, blood flowing down, AND UP the walls, \n"
					+ "and the tortured screams of the damned erupting from the ether in harmony with the pure and raw glory\n"
					+ " power of the heavy metal assaulting your ears just the way you like it. It reminds you the endless nights spent\n"
					+ "at your sweet grandmother's house. You cozy on up to the bar and order a drink. Steaming and bubbling from a \n"
					+ "gleaming chrome plated bottle, you fill your glass. What is it? Good question. Is it lethal? You sure hope so! \n"
					+ "Especially since the programmer has completely overestimated his imagination, and how long this project might \n"
					+ "possibly get. The only true release, is the sweet embrace of death! Or at least a solid drunken blackout! \n"
					+ "Bottoms up!\n\n");
			player = encounterThree(player);
			if(player.getHealth() <= 0) {
				gameOver = true;
			}
		}
			return player;
			
		
	}
	
	/**
	 * First encounter method, accepts and returns player character, creates enemy character, updates score after resolving encounter
	 * @param player
	 * @return
	 */
	public static GriffithsPlayerCharacter encounterOne(GriffithsPlayerCharacter player) {
		GriffithsEnemyChar hondo = new GriffithsEnemyChar("Hondo", 250, 0, 10, 25, 10);
		int option = 0;
		int score = player.getScore();
		
		System.out.println("It's some big ugly dude. All leaning on your crib man.");
		System.out.println("You could try and find out what he wants.");
		System.out.println("-------------------------------------------------------------------------------------");
		do {
		option = tryTalking(player);
		if(option == 1) {
			System.out.println("He, she...it? Who can tell. Anyway, they say 'I'm " + hondo.getName() + " ."
					+ " Clearly not much for words.\n");
			score += 200;
		}
		if(option == 2) {
			System.out.println(hondo.getName() + " looks at you, quite disrespectfully I must say, and grunts "
					+ "'Somebody said you're as tough as I am ugly. I'm here to find out.'\n");
			System.out.println("You can't really say you know what he's talking about, but you seem to remember saying those "
					+ "exact words to somebody, or something, last night.\n");
			System.out.println("As you reflect on your linguistic prowess with a bit of self admiration, you find yourself "
					+ "suddenly assaulted, and rudely interrupted.\n");
			score += 350;
		}
		if(option == 3) {
			System.out.println("You're not messing around are you? Best way to start a morning is with a good old fashioned "
					+ "fight to the death. Yours, someone elses, really it doesn't matter. Death is pretty great.\n");
			score += 500;
		}
		}while(option == 0 || option == 1);
		if(resolveCombat(hondo, player)){
			score += 1500;
		}
		player.setScore(score);
		
		return player;
	
	}
	
	/**
	 * Second player encounter method, accepts and returns player character. Creates npc character, branching options based on stat numbers
	 * updates score after encounter is resolved
	 * @param player
	 * @return
	 */
	public static GriffithsPlayerCharacter encounterTwo(GriffithsPlayerCharacter player) {
		GriffithsEnemyChar spaceBikerSally = new GriffithsEnemyChar("Space Biker Sally", 150, 0, 30, 20, 2);
		Scanner keyboard = new Scanner(System.in);
		boolean fixed = false;
		int option = 0;
		int option2 = 0;
		int score = player.getScore();
		
		System.out.println("She tells you, 'Oh by the way, I'm " + spaceBikerSally.getName() + "\n");
		System.out.println("Wow! Your mom was a space biker! It must be fate.\n");
		
		System.out.println("You decide to: ");
		System.out.println("[1]Help, because its the right thing to do.");
		System.out.println("[2]Help, because...reasons(heavy breathing).");
		System.out.println("[3]Not help, You're kind of a jerk. What's wrong with you?");
		
		do {
			
		
			try {
			option = keyboard.nextInt();
			
				if(option <= 0 || option > 3) {
				System.out.println("This is getting out of hand, [1], [2], or [3], pick one!");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Was that even a number? Did you roll high enough on Intelligence?");
				keyboard.nextLine();
			
			}
		}while(option <= 0 || option > 3);
				
		if(option == 1) {
			System.out.println("Deciding to take the high road for once, you attempt to repair the hog so she can be on her way. What a gentleman...");
			System.out.println("[1]Attempt to realign the thermo dynamic phase chain");
			System.out.println("[2]Recalibrate the plasma induction engine");
			System.out.println("[3]Say some big words while randomly tapping various parts");
			
				do {
					try {
					option2 = keyboard.nextInt();
					
						if(option2 <= 0 || option2 > 3) {
							System.out.println("This is getting out of hand, [1], [2], or [3], thats it!!");
						}
					}
					catch(InputMismatchException e) {
						System.out.println("NUMBERS! ONLY!! Wow...");
						keyboard.nextLine();
					}
				}while(option2 <= 0 || option2 > 3);
			
			if(option2 == 1) {
				if(player.getInt() > 70) {
					System.out.println("Removing the electro-inversion coupling, you carefully realign the phase chain with the thermo emitters!\n"
							+ " You don't even know what any of those are. 500 points!");
					score += 500;
					fixed = true;
				}
				else if(player.getInt() > 40) {
					System.out.println("You somehow manage to realign the phase chain while attempting to remove the samoflange.\n"
							+ " The samoflange regulates the ion dispersion coil! LOL EVERYBODY KNOWS THAT.");
					fixed = true;
				}
				else {
					System.out.println("Can't fix, too dumb.");
					fixed = false;
					}
				}
			else if(option2 == 2) {
				if(player.getDex() > 70) {
					System.out.println("Working those magic fingers (yeah she noticed) you manage to recalibrate the plasma induction engine!\n"
							+ "Even you aren't sure what you did. 500 points!");
					score += 500;
					fixed = true;
				}
				else if(player.getDex() > 40) {
					System.out.println("You try turning it off and on again. Wow, ok that worked.");
					fixed = true;
				}
				else {
					System.out.println("You poke yourself in the eye. How do you live with yourself?");
					fixed = false;
				}
			}
			else {
				System.out.println("Using your most manly voice, and waving your arms around tapping on various parts\n"
						+ "you've never seen before, you use large multisyllabic words trying to sound like you know what\n"
						+ "you're doing. Ironically, something seems to have worked...\n");
				fixed = true;
			}
				
		}		
		
		
		else if(option == 2) {
			System.out.println("You can't quite put your finger on it, but something is compelling you to help. I wonder what it could be.");
			System.out.println("[1]Attempt to realign the thermo dynamic phase chain");
			System.out.println("[2]Recalibrate the plasma induction engine");
			System.out.println("[3]Say some big words while randomly tapping various parts");
			
			do {
				try {
				option2 = keyboard.nextInt();
				
					if(option2 <= 0 || option2 > 3) {
						System.out.println("This is getting out of hand, [1], [2], or [3], thats it!!");
					}
				}
				catch(InputMismatchException e) {
					System.out.println("NUMBERS! ONLY!! Wow...");
					keyboard.nextLine();
				}
			}while(option2 <= 0 || option2 > 3);
			
			
			if(option2 == 1) {
				if(player.getInt() > 70) {
					System.out.println("Removing the electro-inversion coupling, you carefully realign the phase chain with the thermo emitters!\n"
							+ " You don't even know what any of those are. 500 points!");
					score += 500;
					fixed = true;
				}
				else if(player.getInt() > 40) {
					System.out.println("You somehow manage to realign the phase chain while attempting to remove the samoflange.\n"
							+ " The samoflange regulates the ion dispersion coil! LOL EVERYBODY KNOWS THAT.");
					fixed = true;
				}
				else {
					System.out.println("Can't fix, too dumb.");
					fixed = false;
					}
				}
			else if(option2 == 2) {
				if(player.getDex() > 70) {
					System.out.println("Working those magic fingers (yeah she noticed) you manage to recalibrate the plasma induction engine!\n"
							+ "Even you aren't sure what you did. 500 points!");
					score += 500;
					fixed = true;
				}
				else if(player.getDex() > 40) {
					System.out.println("You try turning it off and on again. Wow, ok that worked.");
					fixed = true;
				}
				else {
					System.out.println("You poke yourself in the eye. How do you live with yourself?");
					fixed = false;
				}
			}
			else {
				System.out.println("Using your most manly voice, and waving your arms around tapping on various parts\n"
						+ "you've never seen before, you use large multisyllabic words trying to sound like you know what\n"
						+ "you're doing. Ironically, something seems to have worked...\n");
				fixed = true;
			}
		}
		else if(option == 3) {
			System.out.println("I'm not sure why you'd pick this but, yeah she's not too happy about it. Actually, she's about\n"
					+ "to show you just how unhappy. Oh, no wait, yeah she's attacking you.");
		}
		
		if(fixed) {
			System.out.println("Another chance to show just how amazing you are presented itself, and you were up to the task!");
			System.out.println("Here, have some points, points are great. 1000");
			score += player.getScore() +  1000;
		}
		else if(!fixed) {
			System.out.println("Your phenomenal display of incompetence has drawn you into yet another conflict!\n");
			resolveCombat(spaceBikerSally, player); 
		}
		player.setScore(score);
		return player;
	}
	
	
	/**
	 * Final encounter, ends the game
	 * @param player
	 * @return
	 */
	public static GriffithsPlayerCharacter encounterThree(GriffithsPlayerCharacter player) {
		Scanner keyboard = new Scanner(System.in);
		int menuChoice = 0;
		
		
		do {
			
			System.out.println("\nSteaming, bubbling, pretty sure you even hear it screaming. This is one hell of a drink.\n A man's drink!"
					+ "Well earned, even if it kills you.");
			System.out.println("Decisions, decisions...what do you do?");
			System.out.println("[1]DRINK IT!");
			System.out.println("[2]I'm already drunk! IT'S SCREAMING, ATTACK IT!");
			System.out.println("[3]Back away slowly (wimp, wow)\n");
			
			try {
				menuChoice = keyboard.nextInt();
				if(menuChoice <= 0 || menuChoice > 3) {
					System.out.println("You seriously only have three options, let the pain end!\n");
				}
				
			}
			catch(InputMismatchException e) {
					System.out.println("At this point, I'm just saying whatever you typed is wrong. Do better.\n");
			}
		}while(menuChoice <= 0 || menuChoice > 3);
		
		if(menuChoice == 1) {
			System.out.println("\nWith a glint in your eye, and a smarmy grin, you grip the glass and throw it down your gullet. Sipping is weak, "
					+ " so is tasting, and showering, and table manners. \n\n");
				if(player.getStr() > 50) {
					System.out.println("Your tongue begins to swell, your eyes bleed, your throat is on fire, literally. Flames shoot from \n"
							+ "your mouth as sweat pours down your face. Everything starts to go black and you collapse on the floor banging \n"
							+ "your head off the bar.\n\n"
							+ "You stand up, feeling absolutely amazing. You grab a handful of questionable bar peanuts, throw them on the \n"
							+ "floor and eat the bowl. You feel the drink was a little weak, but you'll let it slide this time.\n\n");
					player.setScore(6969);
				}
				else {
					System.out.println("Your tongue begins to swell, your eyes bleed, your throat is on fire, literally. Flames shoot from \n"
							+ "your mouth as sweat pours down your face. Everything starts to go black and you collapse on the floor banging \n"
							+ "your head off the bar.\n\n"
							+ "Your pretty much dead. Mostly dead. Nope, there it is, you're done. You are unceremoniously dragged outside \n"
							+ "and thrown in the street like the bum you are.\n\n");
					player.setHealth(0);
				}
		}
				
		if(menuChoice == 2) {
			
				GriffithsEnemyChar angryDrink = new GriffithsEnemyChar("Angry Drink!", 25, 1, 1, 1, 1);
			
				System.out.println("\nA questionable drink draws near!");
				System.out.println("You prepare to attack, nobody finds this strange.\n");
				if(resolveCombat(angryDrink, player)){
					System.out.println("Having vanquished the hellish cocktail, glory is yours! Women! Gold! More women! More gold! \n"
							+ "So much gold, and so many women, you are crushed beneath the weight of your triumph!\n"
							+ "Also, apparantly you're dead. You win!");
					player.setHealth(0);
				}
			
		
		}
		if(menuChoice == 3) {
			System.out.println("You back away from the drink slowly, and feel disgusted with your cowardice. You throw yourself on the \n"
					+ "nearest sword, as the bar erupts in cheers as you preserve your honor!/n"
					+ "You're dead, and you're a winner! Go you!");
			player.setHealth(0);
		}
		
		
		
		return player;
	}
	
	/**
	 * Accepts player character, talking dialog option called in encounterOne, returns dialog choice
	 * @param player
	 * @return
	 */
	public static int tryTalking(GriffithsPlayerCharacter player) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("What do you do: \n\n");
		
			do {
				try {
				System.out.println("[1]Who are you?\n"
					+ "[2]What do you want?\n"
					+ "[3]Is that smell coming from you?\n");
				choice = keyboard.nextInt();
			
					if(choice <= 0 || choice > 3) {
						System.out.println("This is getting out of hand, [1], [2], or [3], thats it!!");
					}
				}
				catch(InputMismatchException e) {
					System.out.println("NUMBERS! ONLY!! Wow...");
					keyboard.nextLine();
				}
			}while(choice <= 0 || choice > 3);
		
		if(choice == 1 && player.getInt() > 20) {
			System.out.println("Not really caring, you ask who they are.\n");
		}
		else if(choice == 2 && player.getInt() > 20) {
			System.out.println("You ask what they want, thinking maybe you crashed at the wrong place. It happens. A lot.\n");
		}
		else if(choice == 3 && player.getInt() > 20) {
			System.out.println("You sniff the air, clearly offended by whatever stench assaults your refined senses, inquiring \n"
					+ "if perhaps this persons hygeine isn't up to par.");
		}
		else
			System.out.println("You sort of say - Uhhhhhhh, duuuurrrrrrr, *dooling incessantly*\n"
					+ "Wow, you aren't smart enough to talk?");
		
		return choice;
	}
	
	/**
	 * Combat resolution method. Accepts player and npc/enemy character. Calls damage calc functions, updates player and npc health
	 * accordingly, determines if player or npc is alive or dead. 
	 * @param enemy
	 * @param player
	 * @return
	 */
	public static boolean resolveCombat(GriffithsEnemyChar enemy, GriffithsPlayerCharacter player) {
		Scanner keyboard = new Scanner(System.in);
		int menuChoice = 0;
		int enemyHealth = enemy.getHealth();
		int enemyHit;
		double playerHit = 0.0;
		int playerHP = player.getHealth();
		boolean playerAlive = true;
		
		
		do {
			do {
				System.out.println("What do you do: ");
				System.out.println("[1] Attack with " + player.getWeapon());
				System.out.println("[2] Lets get physical baby!");
				System.out.println("[3] Hocus Pocus style");
				
					try {
					
						menuChoice = keyboard.nextInt();
						if(menuChoice <= 0 || menuChoice > 3) {
							System.out.println("One, two, or three. 1, 2, OR 3! Not, whatever that was.");
						}
					}
					catch(InputMismatchException e) {
						System.out.println("One, two, or three. 1, 2, OR 3! Not, whatever that was.");
						keyboard.nextLine();
					}
			}while(menuChoice <= 0 || menuChoice > 3);
		
		
		
		if(menuChoice == 1) {
			
			System.out.println("You attack with your " + player.getWeapon() + "!");
			if(player.getCharClass() == "Barbarian!") {
			playerHit = player.calcDamage(player.getWeapon(), player.getRageStr());
			}
			else if(player.getCharClass() == "Space Marine") {
				playerHit = player.calcDamage(player.getWeapon(), player.getDmgMod());
			}
			else if(player.getCharClass() == "Drunken Wizard") {
				playerHit = player.calcDamage();
				System.out.println("Why are you doing this? Seriously, only a " + player.getCharClass() + " would try this.");
			}
				System.out.println("You hit for " + playerHit + "damage!\n\n");
				enemyHealth -= playerHit;
				if(enemyHealth > 0) {
					System.out.println(enemy.getName() + " strikes back!");
					enemyHit = enemy.calcDamage(2);
					System.out.println("YOU are hit and  take " + enemyHit + "damage!\n");
					playerHP =  player.getHealth() - enemyHit;
					player.setHealth(playerHP);
					System.out.println("You now have " + player.getHealth() + "health left!\n\n");
					if(player.getHealth() <= 0) {
						playerAlive = false;
						System.out.println("Apparantly, you died.");
						break;
					}
				}
				else {
					System.out.println("You have utterly destroyed " + enemy.getName() + ", even his kids felt it.\n");
				}
			}
		else if(menuChoice == 2) {
			if(player.getStr() > 70) {
				Random num = new Random();
				int attack = num.nextInt(3) +1;
				
				if(player.getRageStr() > 1) {
					if(attack == 1) {
					System.out.println("What's this? I CAN'T BELIEVE IT! YES! ITS THE TOMBSTONE PILEDRIVER!");
					playerHit = player.calcDamage(player.getRageStr());
					System.out.println(enemy.getName() + " takes " + playerHit + "damage!");
					enemyHealth -= playerHit;
					}
					else if(attack == 2) {
						System.out.println("Oh my god IT'S THE POWERBOMB, THE POWERBOMB, IT'S ALL OVER!");
						playerHit = player.calcDamage(player.getRageStr());
						System.out.println(enemy.getName() + " takes " + playerHit + "damage!");
						enemyHealth -= playerHit;
					}
					else if(attack == 3) {
						System.out.println("I don't even know what just happened, but it looks like it hurt! Who knew a spine could bend that way?");
						playerHit = player.calcDamage(player.getRageStr());
						System.out.println(enemy.getName() + " takes " + playerHit + "damage!");
						enemyHealth -= playerHit;
					}
				}
			
				else{
					playerHit = player.calcDamage();
					System.out.println("Double eye poke! " + enemy.getName() + " takes " + playerHit + "damage. That's just dirty...");
					enemyHealth -= playerHit;
				}
				if(enemyHealth > 0) {
					System.out.println(enemy.getName() + " strikes back!");
					enemyHit = enemy.calcDamage(2);
					System.out.println("YOU are hit and  take " + enemyHit + "damage!\n");
					playerHP =  player.getHealth() - enemyHit;
					System.out.println("You now have " + player.getHealth() + "health left!\n\n");
					player.setHealth(playerHP);
					if(player.getHealth() <= 0) {
						playerAlive = false;
						System.out.println("Apparantly, you died.");
						break;
					}
				}
				else {
					System.out.println("I mean, that was kind of overkill, but GOOD FOR YOU!\n");
				}
			}
			else
				System.out.println("You try and punch, but gently brush " +  enemy.getName() + "'s cheek instead. You both feel awkward."
						+ "Clearly, you should try something else.");
		}
		else if(menuChoice == 3) {
			String spells[] = new String[5];
			String spelleffect[] = new String[5];
			int spellChoice = 0;
			String spell = "";
			String spellEffect = "";
			
			if(player.getCharClass() == "Drunken Wizard") {
				spells = player.getSpells();
				spelleffect = player.spellEffect(spells);
				
				System.out.println("You attemp to drunkenly cast a spell! Nice!\n\n");
				System.out.println("---Spell List---\n");
				for(int i = 0; i < 5; i ++) {
					System.out.println("[" + (i+1) + "] " + spells[i] + "\n");
				}
				
				System.out.println("\nChoose your awesome spell!\n\n");
				do {
					try {
							spellChoice = keyboard.nextInt();
							if(spellChoice <= 0 || spellChoice > 5) {
								System.out.println("Um, you don't have spell for that option...");
							}
					}
					catch(InputMismatchException e) {
						System.out.println("I know you're drunk, but wrong selection.");
						keyboard.nextLine();
					}
				}while(spellChoice <= 0 || spellChoice > 5);
				if(spellChoice == 1) {
					spell = spells[0];
					spellEffect = spelleffect[0];
				}
				else if(spellChoice == 2) {
					spell = spells[1];
					spellEffect = spelleffect[1];
				}
				else if(spellChoice == 3) {
					spell = spells[2];
					spellEffect = spelleffect[2];
				}
				else if(spellChoice == 4) {
					spell = spells[3];
					spellEffect = spelleffect[3];
				}
				else if(spellChoice == 5) {
					spell = spells[4];
					spellEffect = spelleffect[4];
				}
				
				System.out.println("You cast " + spell + " !\n" + spellEffect + "\n\n");
				playerHit = player.spellDamage(spell);
				if(player.isCritical()) {
					System.out.println("You drunkenly crit with your drunken spellcast!\n");
				}
				System.out.println("You do " + playerHit + " damage to " + enemy.getName() + "!\n");
				enemyHealth -= playerHit;
				
				if(enemyHealth > 0) {
					System.out.println(enemy.getName() + " strikes back!");
					enemyHit = enemy.calcDamage(2);
					System.out.println("YOU are hit and  take " + enemyHit + "damage!\n");
					playerHP =  player.getHealth() - enemyHit;
					System.out.println("You now have " + player.getHealth() + "health left!\n\n");
					player.setHealth(playerHP);
					if(player.getHealth() <= 0) {
						playerAlive = false;
						System.out.println("Apparantly, you died.");
						break;
					}
				}
				else {
					System.out.println("I mean, that was kind of overkill, but GOOD FOR YOU!\n");
				}
				
			}
			
			else {
				System.out.println("What are you doing? Why are you waving your hands around like that? Are you ok? Try something else.");
			}
		}
		}while(enemyHealth > 0 && playerHP > 0);
		return playerAlive;
	}
	
	/**
	 * Character creation method, asks class choice, calls rollStats function to populate stats, calls weaponChoice function, health and
	 * spells for wizard, returns finished character
	 * @param charChoice
	 * @return
	 */
	public static GriffithsPlayerCharacter createPlayerCharacter(int charChoice) {
		GriffithsPlayerCharacter temp = new GriffithsPlayerCharacter();
		
		
		if(charChoice == 1) {
		temp.setCharClass("Space Marine");
		JOptionPane.showMessageDialog(null, "               YOU are a...\n*******SPACE MARINE**********\n\n               Whoa sick");
		
		temp.setName(createName());
		JOptionPane.showMessageDialog(null, "A tough as nails Space Marine needs stats. Why? Because stats are cool." 
				+ "\n\n   Let's see if you're stronger than a little girl! Rolling for Strength!\n");
		temp.setStr(rollStats());
		
		JOptionPane.showMessageDialog(null, "Strength is ok but, twitchy trigger fingers get all the girls, dexterity is a man's stat! Lets find yours! Rolling Dex!\n");
		temp.setDex(rollStats());
		JOptionPane.showMessageDialog(null, "They say intelligence is sexy. You say you don't have to out-think it if it's dead. But, you got some schoolin'. Rolling Intelligence!");
		temp.setInt(rollStats());
		temp.setWeapon(chooseWeapon(temp));
		
		if(temp.getWeapon() == "Plasma Face Melter") {
			temp.setDmgMod(45.5);
		}
		else if(temp.getWeapon() == "Full Auto Skull Perforator") {
			temp.setDmgMod(55.5);
		}
		else
			temp.setDmgMod(99.5);
		
		JOptionPane.showMessageDialog(null, "Ok, wicked tight bro, so lets see what kind of shape you're in and how many hits you can take!\n");
		temp.setHealth(setStartingHealth());
		}
		
		else if(charChoice == 2) {
			temp.setCharClass("Barbarian!");
			
			JOptionPane.showMessageDialog(null, "               YOU are a...\n*******BARBARIAN!(!!11!)**********\n\n               DUDE, bro, crazy");
			
			temp.setName(createName());
			
			JOptionPane.showMessageDialog(null, "                      You are a " + temp.getCharClass() + ", and you need stats if you're gonna flex! Lets go" 
					+ "\n\n   Strength is what you do. Your arms, your legs, your hair...strong hair is the true measure of a man! Rolling for Strength!\n");
			temp.setStr(rollStats());
			
			if(temp.getStr() >= 75) {
				temp.setRageStr(90);
			}
			else if(temp.getStr() >=50) {
				temp.setRageStr(65);
			}
			else
				temp.setRageStr(40);
			
			JOptionPane.showMessageDialog(null, "Strength is ok but, ok strength is all that matters. Dexterity is just strength spelled wrong, for the fingers!  Rolling Dex!\n");
			temp.setDex(rollStats());
			
			JOptionPane.showMessageDialog(null, "BRAIN STRENGTH. Rolling Intelligence!");
			temp.setInt(rollStats());
			
			temp.setWeapon(chooseWeapon(temp));
			
			JOptionPane.showMessageDialog(null, "Psycho-flexing and punching yourself made you tough, how tough? Who cares, you look fabulous. But let's see anyway!\n");
			temp.setHealth(setStartingHealth());
		}
		else if(charChoice == 3) {
			temp.setCharClass("Drunken Wizard");
			JOptionPane.showMessageDialog(null,  "YOU are a...\n********DRUNKEN WIZARD*********\n\n                     The best kind of wizard, tight");
			
			temp.setName(createName());
			JOptionPane.showMessageDialog(null, "As a powerful, although drunken Wizard, with an unorthodox love of numbers, you desire or even crave stats!"
					+ "even one as beneath you as strength!");
			
			temp.setStr(rollStats());
			
			JOptionPane.showMessageDialog(null, "What kind of wizard doesn't have wild, limber, wiggly fingers, all magic-y and unsettling? Rolling Dex!");
			temp.setDex(rollStats());
			
			JOptionPane.showMessageDialog(null, "Ah, the end all be all before the booze took over. Intelligence is valued the most, even among the one or two braincells left swimming around in there.");
			temp.setInt(rollStats());
			temp.setBoozeCrit(temp.getInt() * 1.5);
			
			temp.setWeapon(chooseWeapon(temp));
			
			JOptionPane.showMessageDialog(null, "You're weak, frail, sickly, what a nerd! But, you've started going to the gym, and damn do you look good at 2 AM."
					+ "How would you rate your health?");
			temp.setHealth(setStartingHealth());
			JOptionPane.showMessageDialog(null, "What is a wizard without his spells? A weird creepy old man in a robe basically, probably be arrested."
					+ "So, lets get some spells!");
			temp.setSpells(playerSpells(temp));
			temp.spellEffect(temp.getSpells());
			
			
	
		}
		return temp;
	}
	
	/**
	 * Method called in character creation for wizard that creates, populates and returns spell list array to character class
	 * @param temp
	 * @return
	 */
	public static String[] playerSpells(GriffithsPlayerCharacter temp) {
		String spells[] = new String[5];
		String userInput;
		int choice = 0;
		
		
		do {
		choice = 0;
		
		try {
		for(int i = 0; i < 5; i ++) {
			userInput = JOptionPane.showInputDialog("Spells make a wizard so much more than a hobo. Pick spell number " + (i+1) + ".\n "
					+ "[1] Balls of Burning\n"
					+ "[2] Thunderfinger\n"
					+ "[3] Blast of Grossness\n"
					+ "[4] Transformation of OMGLOL\n"
					+ "[5] Piercing Missle of Peircingness\n"
					+ "[6] Dank Cloud\n"
					+ "[7] Funk Smelling Fist of Assault\n"
					+ "[8] OMG THE ROOM IS ON FIRE\n");
			
			choice = Integer.parseInt(userInput);
		
			if(choice == 1) {
				spells[i] = "Balls of Burning";
			}
			else if(choice == 2) {
				spells[i] = "Thunderfinger";
			}
			else if(choice == 3) {
				spells[i] = "Blast of Grossness";
			}
			else if(choice == 4) {
				spells[i] = "Transformation of OMGLOL";
			}
			else if(choice == 5) {
				spells[i] = "Piercing Missle of Piercingness";
			}
			else if(choice == 6) {
				spells[i] = "Dank Cloud";
			}
			else if(choice == 7) {
				spells[i] = "Funk Smelling Fist of Assault";
			}
			else if(choice == 8) {
				spells[i] = "OMG THE ROOM IS ON FIRE";
			}
			
		}
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Pretty sure that might not have been a number.");
		}
		}while(choice <= 0  || choice > 8);
		
		
		return spells;
		
	}

	/**
	 * Character class choice method, returns menuChoice
	 * @return
	 */
	public static int characterCreation() {
		int menuChoice;
		String userInput;
		
		do {
			menuChoice = 0;
			try {
			userInput = JOptionPane.showInputDialog("You always wanted to be a: \n"
					+ "[1] Space Marine - A face fisting plasma burning destroyer, fun at parties.\n"
					+ "[2] Barbarian! - Running naked (unnecessarily...probably) into battle inpsiring fear in all who see you!\n"
					+ "[3] Drunken Wizard - The party never ended after wizard school! WOOOOOooooooo!!\n");
			menuChoice = Integer.parseInt(userInput);
			if(menuChoice <= 0 || menuChoice > 3) {
				JOptionPane.showMessageDialog(null, "Menu's are hard. [1], [2], or [3], ok?");
			}
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null,  "Ok, real quick, [1], [2], or [3], not whatever you typed.");
			}
		}while(menuChoice <= 0 || menuChoice > 3);
			
		
		return menuChoice;
	}
	
	/**
	 * character name creation function
	 * @return
	 */
	public static String createName() {
		String charName;
		
		charName = JOptionPane.showInputDialog("Your character needs a rad name, nothing less will be accepted. \n                              Enter your rad name: ");
		JOptionPane.showMessageDialog(null, "That is a sufficiently rad name.");
		
		return charName;
		
	}
	
	/**
	 * roll dice function for populating stats. Uses random. Allows rerolling
	 * @return
	 */
	public static int rollStats() {
		Random roll = new Random();
		String userInput;
		
		int menuChoice = 0;
		int num = roll.nextInt(100) + 1;
		
		
		do {
			try {
		
				userInput = JOptionPane.showInputDialog("    Rolling the dice...!!\n\n" + num + " was rolled. Keep it?\n\n"
						+ "        Roll again! [1]\n"
						+ "        Keep it!     [2]\n");
				menuChoice = Integer.parseInt(userInput);
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Huh? You have two choices, that wasn't one of them...");
			}
		}while(menuChoice == 0);
				
				
		do {
		if(menuChoice == 1) {
			do {
				menuChoice = 0;
				try {
					num = roll.nextInt(100) + 1;
					userInput = JOptionPane.showInputDialog("    Rolling the dice...!!\n\n" + num + " was rolled. Keep it?\n\n"
							+ "        Roll again! [1]\n"
							+ "         Keep it!    [2]\n");
					menuChoice = Integer.parseInt(userInput);
				}
				catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Huh? You have two choices, that wasn't one of them...");
				}
			}while(menuChoice == 0);
		}
		
		}while(menuChoice == 1);
		return num;
	}
	
	/**
	 * Weapon choice method, returns string of weapon choice to player character
	 * @param temp
	 * @return
	 */
	public static String chooseWeapon(GriffithsPlayerCharacter temp) {
		String userInput = "";
		int menuChoice = 0;
		String weapon = "";
		
		
		if(temp.getCharClass() == "Space Marine") { 
		
		do {
			try {
				
				userInput = JOptionPane.showInputDialog("Time to gear up, what's your weapon of choice?\n\n"
						+ "[1] Plasma Face Melter\n"
						+ "[2] Full Auto Skull Perforator\n"
						+ "[3] I am a weapon!\n");
		
				menuChoice = Integer.parseInt(userInput);
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "[1], [2], or [3], which part of that was too hard?");
			}
		}while(menuChoice == 0);
		
		
		switch(menuChoice) {
		case 1:
			weapon = "Plasma Face Melter";
			break;
		case 2:
			weapon = "Full Auto Skull Perforator";
			break;
		case 3:
			weapon = "I am a weapon!";
			break;
		}
		}
		
		else if(temp.getCharClass() == "Barbarian!") {
			
			do {
				menuChoice = 0;
				try {
					
				userInput = JOptionPane.showInputDialog("You need a weapon, but you love them all, and everything is a weapon if you use it wrong enough.\n\n"
						+ "[1] Sonic Fists of Death\n"
						+ "[2] Brode Sode!\n"
						+ "[3] Axe of Cleavage\n");
				
				menuChoice = Integer.parseInt(userInput);
				
				}
			catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "[1], [2], or [3], which part of that was too hard?");
				
				}
			}while(menuChoice > 3 || menuChoice <= 0);
			
			
			switch(menuChoice) {
			case 1:
				weapon = "Sonice Fists of Death";
				break;
			case 2:
				weapon = "Brode Sode!";
				break;
			case 3:
				weapon = "Axe of Cleavage";
				break;
			}
		}
		else if(temp.getCharClass() == "Drunken Wizard") {
				do {
					menuChoice = 0;
					try {
						
						userInput = JOptionPane.showInputDialog("You don't really need a weapon, you're more likely to fall on it than stab someone,"
								+ "but, sometimes its nice to look prepared.\n\n"
								+ "[1] Dagger of Poking\n"
								+ "[2] Staff of Holding Yourself Up\n"
								+ "[3] Wand of I Have No Idea(I think its a stick or something)\n");
						
						menuChoice = Integer.parseInt(userInput);
					}
					
					catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "[1], [2], or [3], go home " + temp.getName() + " you're druink. Try again!");
					}
				}while(menuChoice > 3 || menuChoice <= 0);
				
				switch(menuChoice) {
				case 1:
					weapon = "Dagger of Poking";
					break;
				case 2: 
					weapon = "Staff of Holding Yourself Up";
					break;
				case 3:
					weapon = "Wand of I Have No Idea";
					break;
				}
			}
			
		
		return weapon;
	}
	
	/**
	 * Set starting health method
	 * @return
	 */
	public static int setStartingHealth() {
		String userInput;
		int menuChoice = 0;
		int health = 0;
		
		do {
			try {
				
				userInput = JOptionPane.showInputDialog("Damn, you look pretty ripped, do you work out?\n\n"
						+ "[1] I worked out once, 0 stars, would not recommend.\n"
						+ "[2] Sometimes, but mostly so I won't die.\n"
						+ "[3] CHECK OUT THESE GAINS BRO.\n");
				menuChoice = Integer.parseInt(userInput);
			}
			
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "[1], [2], or [3], shouldn't we be better at this by now?");
			}
			
		}while(menuChoice > 3 || menuChoice <= 0);
		
		if(menuChoice == 1) {
			health = 150;
		}
		else if(menuChoice == 2) {
			health = 280;
		}
		else if(menuChoice == 3) {
			health = 620;
		}
		
		return health;
		
	}
	
	/**
	 * Method for printing player character information and score to file, creates file if it doesn't exist, appends file if it does
	 * @param player
	 */
	public static void printPlayer(GriffithsPlayerCharacter player) {
		try {
		FileWriter fwriter = new FileWriter("PlayerScores.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		outputFile.println(player.toString());
		outputFile.close();
		fwriter.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found or unable to be created.");
		}
		catch(IOException e) {
			System.out.println("File error");
		}
		
		
	}

}
