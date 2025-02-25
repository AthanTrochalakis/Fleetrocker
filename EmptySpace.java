/**
 * A subclass for representing empty space in levels.
 *
 * @author Athan Trochalakis
 * @version 2/24/2025
 */
public class EmptySpace extends LevelObject{

    public EmptySpace(int newX, int newY, char newChar){
	super(newX, newY, newChar, "\u001B[37m");
    }
}
