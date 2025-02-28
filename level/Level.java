import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;

/**
 * A class for handling levels in Fleetrocker
 *
 * @author Athan Trochalakis
 * @version 2/27/2025
 */
public class Level{
    public ArrayList<LevelObject> levelObjects;
    //ArrayList<Enemy> enemies;
    //ArrayList<Equipment> equipment;

    public Level(String levelFileName){
	this.levelObjects = new ArrayList<LevelObject>();
	try{
	    File levelData = new File(levelFileName);
	    Scanner levelReader = new Scanner(levelData);
	    int currentY = 0;
	    while(levelReader.hasNextLine()){
		String currentLine = levelReader.nextLine();
		//Read in level data file, using characters within it to initialize level objects
		for(int i = 0; i < currentLine.length(); i++){ //i can act as X position
		    LevelObject newObject = null;
		    if(currentLine.charAt(i) == 'E'){ //E for Entrance teleporter
			ImageIcon newImage = new ImageIcon("../levelSprites/teleporter.png");
			newObject = new Teleporter(i, currentY, newImage, true);
		    } else if(currentLine.charAt(i) == 'L'){ //L for Leaving teleporter
			ImageIcon newImage = new ImageIcon("../levelSprites/teleporter.png");
			newObject = new Teleporter(i, currentY, newImage, false);
		    } else if(currentLine.charAt(i) == '#'){ //# for Wall
			ImageIcon newImage = new ImageIcon("../levelSprites/wall.png");
			newObject = new Wall(i, currentY, newImage);
		    } else if(currentLine.charAt(i) == 'D'){ //D for Door
		        ImageIcon newClosedImage = new ImageIcon("../levelSprites/closedDoor.png");
			ImageIcon newOpenImage = new ImageIcon("../levelSprites/openDoor.png");
			newObject = new Door(i, currentY, newClosedImage, newOpenImage);
		    } else if(currentLine.charAt(i) == '.'){ //. for floor
		        ImageIcon newImage = new ImageIcon("../levelSprites/floor.png");
			newObject = new EmptySpace(i, currentY, newImage);
		    } else{ //else is completely empty space, transparent sprite
		        ImageIcon newImage = new ImageIcon("../levelSprites/empty.png");
			newObject = new EmptySpace(i, currentY, newImage);
		    }
		    if(newObject != null){
			levelObjects.add(newObject);
		    }
		}
		currentY++;
	    }
	} catch (FileNotFoundException e){
	    System.out.println("Failed to reference level data due to non-existent file");
	}
    }
}
