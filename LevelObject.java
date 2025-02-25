/**
 * A superclass for handling static objects in levels in Fleetrocker.
 *
 * @author Athan Trochalakis
 * @version 2/20/2025
 */
public class LevelObject{
    protected int xPos;
    protected int yPos;
    protected char objectChar;
    protected String color;

    public LevelObject(int newX, int newY, char newChar, String newColor){
	this.xPos = newX;
	this.yPos = newY;
	this.objectChar = newChar;
	this.color = newColor;
    }

    public int getXPos(){
	return this.xPos;
    }

    public int getYPos(){
	return this.yPos;
    }

    public String getColor(){
	return this.color; //ansi escape code
    }

    public String toString(){
	return "" + this.objectChar; //ascii character, maybe eventually sprite
    }
}
