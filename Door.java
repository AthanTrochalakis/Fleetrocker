/**
 * A subclass of LevelObject for representing interactable doors.
 *
 * @author Athan Trochalakis
 * @version 2/23/2025
 */
public class Door extends Wall{

    public Door(int newX, int newY){
	super(newX, newY, 'D', "\u001B[33m");
    }

    public void changeStatus(){ //when player interacts with door
	this.canCollide = !this.canCollide;
    }
}
