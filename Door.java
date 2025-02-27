import javax.swing.ImageIcon;

/**
 * A subclass of LevelObject for representing interactable doors.
 *
 * @author Athan Trochalakis
 * @version 2/26/2025
 */
public class Door extends Wall{
    protected ImageIcon closedImage;
    protected ImageIcon openImage;
    public ImageIcon activeImage;

    public Door(int newX, int newY, ImageIcon newClosedImage, ImageIcon newOpenImage){
	super(newX, newY, newClosedImage);
	this.closedImage = newClosedImage;
	this.openImage = newOpenImage;
	this.activeImage = this.closedImage;
    }

    @Override
    public ImageIcon getImage(){
	return this.activeImage;
    }

    public void changeCollide(){ //when player interacts with door
	this.canCollide = !this.canCollide;
	if(this.canCollide){
	    this.activeImage = this.closedImage;
	} else{
	    this.activeImage = this.openImage;
	}
    }
}
