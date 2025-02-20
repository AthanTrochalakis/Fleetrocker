/**Class to interact with player elements
 *
 * 
 */
public class Player implements Character{
    //variables
    public int health;
    public int damage;
    
    /**Bace constructor for player class
     * Default health = 100, Default damage = 25
     */
    public Player(){
	this.health = 100;
	this.damage = 25;
    }
    /**Constructor for player class
     * @param health Player health
     * @param damage Player Damage
     */
    public Player(int health, int damage){
	this.health = health;
	this.damage = damage;
    }

    public int dealDamage(int damage){
	if(this.health - damage < 0){
	    this.health = 0;
	    return 0;
	} else {
	    this.health = this.health - damage;
	    return this.health;
	}
    }

    public int regenerate(int health){
	if(this.health + health > 100){
	    this.health = 100;
	    return this.health;
	} else {
	    this.health = this.health + health;
	    return this.health;
	}
    }

    public int getHealth(){
	return this.health;
    }

    public void setHealth(int health){
	if(health < 101){
	    this.health = health;
	}
    }

    public int getDamage(){
	return this.damage;
    }

    public void setDamage(int damage){
	this.damage = damage;
    }

    
}
