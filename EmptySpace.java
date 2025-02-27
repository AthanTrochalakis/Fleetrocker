import java.awt.*;

/**
 * A subclass for representing empty space in levels.
 * Empty space can be either actual empty space, or a floor.
 *
 * @author Athan Trochalakis
 * @version 2/26/2025
 */
public class EmptySpace extends LevelObject{

    public EmptySpace(int newX, int newY, Image newImage){
	super(newX, newY, newImage);
    }
}
