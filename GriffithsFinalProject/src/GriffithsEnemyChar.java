/**
 * Date 11/20/2019
 * @author Mark Griffiths
 * Class: CSC151
 * Purpose: Extends Actor class creates enemy or non player character object for interaction
 *
 */
public class GriffithsEnemyChar extends GriffithsActor{

	int level;
	int damage;
	
	GriffithsEnemyChar(){

		super();
		this.level = 1;
		this.damage = 1;
	}
	
	GriffithsEnemyChar(String name, int health, int score, int str, int damage, int level){
		super(name, score, health, str);
		this.level = level;
		this.damage = damage;
	}
	
	
/**
 * Setter fucntion for damage calc
 * @param damage
 */
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	

	/**
	 * Overloaded damage calculation function
	 * @return
	 */
	
	public int calcDamage() {
		return damage += super.getStr();
	}
	
	public int calcDamage(int level) {
		return damage += super.getStr() * level;
	}
	
}
