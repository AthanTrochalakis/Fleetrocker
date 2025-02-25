/**
 * A subclass of LevelObject for representing walls
 *
 * @author Athan Trochalakis
 * @version 2/24/2025
 */
public class Wall extends LevelObject{
    protected boolean canCollide;

    public Wall(int newX, int newY){
	super(newX, newY, '#', "\u001B[37m");
    }
    
    public Wall(int newX, int newY, char newChar, String newColor){
	super(newX, newY, newChar, newColor);
	canCollide = true;
    }
}
