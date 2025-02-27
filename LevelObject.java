import javax.swing.ImageIcon;

/**
 * A superclass for handling static objects in levels in Fleetrocker.
 *
 * @author Athan Trochalakis
 * @version 2/26/2025
 */
public class LevelObject{
    public int xPos;
    public int yPos;
    public int size;
    public ImageIcon objectImage;

    public LevelObject(int newX, int newY, ImageIcon newImage){
	this.xPos = newX;
	this.yPos = newY;
	this.size = 32;
	this.objectImage = newImage;
    }

    public int getXPos(){
	return this.xPos;
    }

    public int getYPos(){
	return this.yPos;
    }

    public int getSize(){
	return this.size;
    }

    public ImageIcon getImage(){
	return this.objectImage;
    }
}
