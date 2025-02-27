import java.awt.*;
import java.util.ArrayList;

/**
 * A subclass of LevelObject for representing walls
 *
 * @author Athan Trochalakis
 * @version 2/24/2025
 */
public class Wall extends LevelObject{
    protected boolean canCollide;
    
    public Wall(int newX, int newY, Image wallImage){
	super(newX, newY, wallImage);
	this.canCollide = true;
    }

    /**
     * Takes the positions and size of an object which implements the
     * Character interface and compares those values with the positions
     * and size of the current wall, returning an ArrayList with the
     * changes that need to be made to the Character object's x and y.
     */
    public ArrayList<Integer> getCollision(int charXPos, int charYPos, int charSize){
	ArrayList<Integer> coordChanges = new ArrayList<>();
	int xChange = 0;
	int yChange = 0;
	if(this.canCollide){
	    //character coming from right
	    if(charXPos >= (this.xPos + (this.size / 2)) &&
	       charXPos < (this.xPos + this.size)){
		xChange = charXPos - (this.xPos + (this.size / 2));
	    }
	    //character coming from below
	    if(charYPos >= (this.yPos + (this.size / 2)) &&
	       charYPos < (this.yPos + this.size)){
		yChange = charYPos - (this.yPos + (this.size / 2));
	    }
	    //character coming from left
	    if((charXPos + charSize) > this.xPos &&
	       (charXPos + charSize) < (this.xPos + (this.size / 2))){
		xChange = (this.xPos + (this.size / 2)) - charXPos;
	    }
	    //character coming from above
	    if((charYPos + charSize) > this.yPos &&
	       (charYPos + charSize) < (this.yPos + (this.size / 2))){
		yChange = (this.yPos + (this.size / 2)) - charYPos;
	    }
	}
	coordChanges.add(xChange);
	coordChanges.add(yChange);
	return coordChanges;
    }
}
