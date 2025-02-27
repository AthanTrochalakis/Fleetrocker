import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.*;

/**
 * A class for handling levels in Fleetrocker
 *
 * @author Athan Trochalakis
 * @version 2/20/2025
 */
public class Level{
    private int levelNum;
    private ArrayList<LevelObject> levelObjects;
    //ArrayList<Enemy> enemies;
    //ArrayList<Equipment> equipment;

    public Level(String levelFileName, int currentLevel){
	this.levelNum = currentLevel;
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
			Image newImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/teleporter.png");
			newObject = new Teleporter(i, currentY, newImage, true);
		    } else if(currentLine.charAt(i) == 'L'){ //L for Leaving teleporter
			Image newImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/teleporter.png");
			newObject = new Teleporter(i, currentY, newImage, false);
		    } else if(currentLine.charAt(i) == '#'){ //# for Wall
			Image newImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/wall.png");
			newObject = new Wall(i, currentY, newImage);
		    } else if(currentLine.charAt(i) == 'D'){ //D for Door
			Image newClosedImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/closedDoor.png");
			Image newOpenImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/openDoor.png");
			newObject = new Door(i, currentY, newClosedImage, newOpenImage);
		    } else if(currentLine.charAt(i) == '.'){ //. for floor
			Image newImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/floor.png");
			newObject = new EmptySpace(i, currentY, newImage);
		    } else{ //else is completely empty space, transparent sprite
			Image newImage = Toolkit.getDefaultToolkit().getImage("../levelSprites/empty.png");
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

    public int getLevelNum(){
	return this.levelNum;
    }

    public void incrementLevelNum(){
	this.levelNum++;
    }

    /**
     * Get the full list of level objects for use in
     * graphics rendering and gameplay logic.
     */
    public ArrayList<LevelObject> getLayout(){
	return this.levelObjects;
    }
}
