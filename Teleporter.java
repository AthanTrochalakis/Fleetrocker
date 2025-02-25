/**
 * A subclass of LevelObject which represents teleporters.
 * 
 * @author Athan Trochalakis
 * @version 2/23/2025
 */
public class Teleporter extends Wall{
    protected boolean isEntry; //do you arrive at or leave a ship here?

    public Teleporter(int newX, int newY, boolean newEntry){
	super(newX, newY, 'T', "\u001B[46m");
	this.isEntry = newEntry;
    }

    public void useTeleporter(){
	if(!this.isEntry){
	    //play teleport animation
	    //increment level number
	    //generate new level
	    //set player position to entry teleporter in new level
	}
    }
}
