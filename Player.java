import javax.swing.ImageIcon;
import java.awt.Image;

/**Class to interact with player elements
 *
 * 
 */
public class Player implements Character{
    //variables
    public int health;
    private int maxHealth;
    public int damage;
    public int x;
    public int y;
    //Sprite variables
    public ImageIcon Static;

    //bellow is commented out for future use.
    //public Image up;
    //public Image down;
    //public Image left;
    //public Image right;
    
    /**Bace constructor for player class
     * Default health = 100, Default damage = 25
     */
    public Player(){
	this.health = 100;
        this.maxHealth = 100;
	this.damage = 25;
    }
    /**Constructor for player class
     * @param health Player health
     * @param maxHealth Max regeneratable health
     * @param damage Player Damage
     */
    public Player(int health, int damage, int maxHealth){
	this.health = health;
	this.maxHealth = maxHealth;
	this.damage = damage;
    }

    /**Set sprites will take a file path to a folder and expect that you already have 5 .png images
     * named static, up, down, left, right already set up in the folder.
     * @param filePath Path to the folder containing PNGs for the payer sprites, end with /
     */
    public void setSprites(String filePath){
	//set static img
	ImageIcon icon  = new ImageIcon(filePath + "static.png");
	this.Static = icon;

	//below is commented out for future use.

	//set up img
	//icon = new ImageIcon(filePath + "up.png");
	//this.up = icon;
	//set dowm img
	//icon = new ImageIcon(filePath + "down.png");
	//this.down = icon;
	//set left img
	//icon = new ImageIcon(filePath + "left.png");
	//this.left = icon;
	//set right img
	//icon = new ImageIcon(filePath + "right.png");
	//this.right = icon;
    }


    //Interface methods
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
	if(this.health + health > maxHealth){
	    this.health = maxHealth;
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
        this.health = health;
    }

    public int getDamage(){
	return this.damage;
    }

    public void setDamage(int damage){
	this.damage = damage;
    }
    
    public int getX(){
	return this.x;
    }
    public int getY(){
	return this.y;
    }
    public void setX(int x){
	this.x = x;
    }
    public void setY(int y){
	this.y = y;
    }
    
}
