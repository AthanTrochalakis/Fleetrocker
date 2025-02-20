/**Class to interact and create new enemies.
 *
 */
public class Enemy implements Character{
    //variables
    public int health;
    public int damage;
    public int maxHealth;

    //Constructors start here
    
    /**Default constructor for Enemies
     * Health = 75, Max Health = 75, Damage = 17
     */
    public Enemy(){
	health = 75;
	maxHealth = 75;
	damage = 17; //kill player in 6 hits
    }
    /**Constructor for Enemies
     * @param health The health for Enemy
     * @param damage The damage Enemy can do
     * @param maxHealth The maximum health Enemy can regenerate to
     */
    public Enemy(int health, int damage, int maxHealth){
	this.health = health;
	this.maxHealth = maxHealth;
	this.damage = damage;
    }

    //Methods from interface start here
    
    public int dealDamage(int damage){
	if(this.health - damage < 1){
	    this.health = 0;
	    return 0;
	} else {
	    this.health = this.health - damage;
	    return this.health;
	}
    }
    public int regenerate(int health){
	if(this.health + health > this.maxHealth){
	    this.health = this.maxHealth;
	    return this.maxHealth;
	} else {
	    this.health = this.health + health;
	    return this.health;
	}
    }
    public int getHealth(){
	return this.health;
    }
    public void setHealth(int health){
	this.health = health;
    }
    public int getDamage(){
	return this.damage;
    }
    public void setDamage(int damage){
	this.damage = damage;
    }
    
}
