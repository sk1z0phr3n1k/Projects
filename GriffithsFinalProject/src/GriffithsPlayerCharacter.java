/**
 * Date: 11/20/2019
 * @author Mark Griffiths
 * Class: CSC151
 * Purpose: Create the Player Character class object, extends Actor object
 *
 */

import java.util.Random;
public class GriffithsPlayerCharacter extends GriffithsActor{
	String [] spells;
	String [] spellEffects;
	private String weapon;
	private String charClass;
	private int dexterity;
	private int intelligence;
	private int rageStr;
	private double dmgMod;
	double boozeCrit;


	public GriffithsPlayerCharacter() {
		super();
		this.weapon = "Fists!";
		this.charClass = "Nooblet";
		this.dexterity = 1;
		this.intelligence = 1;
		this.rageStr = 1;
		this.dmgMod = 0.01;
		this.boozeCrit = 0.01;
	}

	public GriffithsPlayerCharacter(String name, int score, String weapon, String charClass, int health, int str, int dex, int intel, int rageStr, double dmgMod, double boozeCrit) {
		super(name, score, health, str);
		this.weapon = weapon;
		this.charClass = charClass;
		this.dexterity = dex;
		this.intelligence = intel;
		this.rageStr = rageStr;
		this.dmgMod = dmgMod;
		this.boozeCrit = boozeCrit;
	}

	/**
	 * Setter and Getter function for player attributes
	 * @param weapon
	 */
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}
	
	public void setDex(int dex) {
		this.dexterity = dex;
	}
	
	public void setInt(int intel) {
		this.intelligence = intel;
	}
	
	public void setRageStr(int rageStr) {
		this.rageStr = rageStr;
	}
	
	
	public String getWeapon() {
		return weapon;
	}
	
	public String getCharClass() {
		return charClass;
	}
	
	public int getDex() {
		return dexterity;
	}
	
	public int getInt() {
		return intelligence;
	}
	
	public int getRageStr() {
		return rageStr;
	}
	
	public void setDmgMod(double dmgMod) {
		this.dmgMod = dmgMod;
	}
	
	public double getDmgMod() {
		return dmgMod;
	}
	
	public void setBoozeCrit(double boozeCrit) {
		this.boozeCrit = boozeCrit;
	}
	
	public double getBoozeCrit() {
		return boozeCrit;
	}
	
	
	/**
	 * Overloaded damage calculation methods for each class
	 * @param weapon
	 * @param rageStr
	 * @return
	 */
	public int calcDamage(String weapon, int rageStr) {
		Random hits = new Random();
		int damage = hits.nextInt(50) + 1;
		if(weapon == "Brode Sode!") {
			damage += rageStr;
		}
		else if(weapon == "Axe of Cleavage") {
			damage += rageStr + 25;
		}
		else
			damage += rageStr * 10;
		
		return damage;
	}
	
	public double calcDamage(String weapon, double dmgMod) {
		Random hits = new Random();
		double damage = hits.nextInt(5) + 1;
		
		if(weapon == "Plasma Face Melter") {
			damage *= dmgMod;
		}
		else if(weapon == "Full Auto Skull Perforator") {
			damage += (dmgMod * 2);
		}
		else
			damage += dmgMod * 6;
		
		return damage;
	}
	
	public int calcDamage(int rageStr) {
		int damage;
		
		damage = (rageStr + (super.getStr())) + 100;
		return damage;
	}
	
	public int calcDamage() {
		Random hits = new Random();
		int damage = hits.nextInt(10) + 1;
		return damage;
	}
	
	
	/**
	 * Spell damage calculation method
	 * @param spell
	 * @return
	 */
	public double spellDamage(String spell) {
		double spellDamage = 0.0;
		
		
		if(spell == "Balls of Burning") {
			spellDamage = this.intelligence * 2;
		}
		else if(spell == "Thunderfinger") {
			spellDamage = this.intelligence + 50 ;
		}
		else if(spell == "Blast of Grossness") {
			spellDamage = (this.intelligence * 10) / 3;
		}
		else if(spell == "Transformation of OMGLOL") {
			spellDamage = this.intelligence * 2.5;
		}
		else if(spell == "Piercing Missle of Piercingness") {
			spellDamage = this.intelligence * 2 + 50;
		}
		else if(spell == "Dank Cloud") {
			spellDamage = this.intelligence * 1.5 +70;
		}
		else if(spell == "Funk Smelling Fist of Assault") {
			spellDamage = this.intelligence *  4.2;
		}
		else if(spell == "OMG THE ROOM IS ON FIRE") {
			spellDamage = this.intelligence * 10;
		}
		if(isCritical()) {
			spellDamage *= 2;
		}
		
		return spellDamage;
	}
	
	
	/**
	 * String Array method accepting Spell name array and returning spell effect description from array
	 * @param spells
	 * @return
	 */
	public String[] spellEffect(String[] spells) {
		String[] spellEffect = new String[5];
		
		for(int i = 0; i < 5; i ++) {
		if(spells[i] == "Balls of Burning") {
			spellEffect[i] = "You grab your flaming balls and hurl them at your enemey!";
		}
		else if(spells[i] == "Thunderfinger") {
			spellEffect[i] = "Your finger is charged with lightning! Where'd it go? Uh oh!";
		}
		else if(spells[i] == "Blast of Grossness") {
			spellEffect[i] = "Ugh what was that? Where did it even come from? It's everywhere!";
		}
		else if(spells[i] == "Transformation of OMGLOL") {
			spellEffect[i] = "Your target gives up his job, moves back home into his mom's basement. Not quite the transformation you had in mind.";
		}
		else if(spells[i] == "Piercing Missle of Piercingness") {
			spellEffect[i] = "You blast pointed pointy objects with many points in your targets general direction!";
		}
		else if(spells[i] == "Dank Cloud") {
			spellEffect[i] = "Dude you smell that? Your target gets the munchies, and his olfactory senses overload.";
		}
		else if(spells[i] == "Funk Smelling Fist of Assault") {
			spellEffect[i] = "Your funk smelling fist, pulled from only you know where, pummels your target!";
		}
		else if(spells[i] == "OMG THE ROOM IS ON FIRE") {
			spellEffect[i] = "Seriously? THE ROOM IS ON FIRE!";
		}
		
		}
		return spellEffect;
	}
	
	
	/**
	 * Method for determining critical spell hit for drunken wizard
	 * @return
	 */
	public boolean isCritical() {
		boolean isCrit = false;
		Random crit = new Random();
		int critical = crit.nextInt(50) + 1;
		
		if(this.boozeCrit > critical) {
			isCrit = true;
		}
		return isCrit;
	}
	
	/**
	 * Method for accepting array with spell choices and populating character spell storage array
	 * @param spells
	 */
	public void setSpells(String[] spells) {
		this.spells = spells;
	}
	
	public String[] getSpells() {
		return spells;
	}
	
	
	/**
	 * ToString method for player character class
	 */
	public String toString() {
		String str = super.toString();
	
		str += "Dexterity: " + this.dexterity + "\n";
		str += "Intelligence: " + this.intelligence + "\n";
		str += "Weapon: " + this.weapon + "\n";
		str += "Class: " + this.charClass + "\n";
		if(this.charClass == "Barbarian!") {
			str += "Rage Strength Bonus: " + this.rageStr + "\n";
		}
		else if(this.charClass == "Space Marine") {
			str += "Damage Mod: " + this.dmgMod + "\n";
		}
		else if(this.charClass == "Drunken Wizard") {
			str += "Spell List\n\n";
			for(int i = 0; i < 5; i ++) {
				str += spells[i] + "\n";
			}
		}
		return str;
	}



}