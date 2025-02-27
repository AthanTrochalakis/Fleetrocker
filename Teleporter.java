import java.awt.*;

/**
 * A subclass of LevelObject which represents teleporters.
 * 
 * @author Athan Trochalakis
 * @version 2/26/2025
 */
public class Teleporter extends Wall{
    protected boolean isEntry; //do you arrive at or leave a ship here?

    public Teleporter(int newX, int newY, Image newImage, boolean newEntry){
	super(newX, newY, newImage);
	this.isEntry = newEntry;
    }

    public void useTeleporter(){
	if(!this.isEntry){
	    //currentLevel.incrementLevelNum();
	    //initialize new level
	}
    }
}
