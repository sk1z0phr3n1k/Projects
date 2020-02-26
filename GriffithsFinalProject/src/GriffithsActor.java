/**
 * Date: 11/20/2019
 * @author Mark Griffiths
 * Class: CSC151
 * Purpose: Create the Player Character class object
 *
 */


import java.util.Random;
public class GriffithsActor {
	private String name;
	private int health;
	private int strength;
	private int score;

	

	public GriffithsActor() {
		this.name = "Durr";
		this.health = 1;
		this.strength = 1;
		this.score = 0;
	
	}

	public GriffithsActor(String name, int score, int health, int str) {
		this.name = name;
		this.health = health;
		this.strength = str;
		this.score = score;
	}

	/**
	 * Setter and getter functions for base class attributes
	 * @param str
	 */
	public void setStr(int str) {
		this.strength = str;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
		
	public int getHealth() {
		return health;
	}
	
	public int getStr() {
		return strength;
	}
	
	
	/**
	 * Base default damage calc function
	 * @param dmg
	 * @return
	 */
	public int calcDamage(int dmg) {
		Random hits = new Random();
		int damage = hits.nextInt(50) + 1;
		
		damage += this.strength * dmg;
			
		return damage;
	}
		
	
	/**
	 * ToString method to print character information and write to file
	 */
	public String toString() {
		String str = "";
		str += "Name: " + this.name + "\n";
		str += "Score: " + this.score + "\n";
		str += "Health: " + this.health + "\n";
		str += "Strength: " + this.strength + "\n";
					
		return str;
	}
	
	
}
