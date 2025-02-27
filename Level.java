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
			ImageIcon newImage = new ImageIcon("../levelSprites/teleporter.png");
			newObject = new Teleporter(i, currentY, newImage, true);
			System.out.print("E");
		    } else if(currentLine.charAt(i) == 'L'){ //L for Leaving teleporter
			ImageIcon newImage = new ImageIcon("../levelSprites/teleporter.png");
			newObject = new Teleporter(i, currentY, newImage, false);
			System.out.print("L");
		    } else if(currentLine.charAt(i) == '#'){ //# for Wall
			ImageIcon newImage = new ImageIcon("../levelSprites/wall.png");
			newObject = new Wall(i, currentY, newImage);
			System.out.print("#");
		    } else if(currentLine.charAt(i) == 'D'){ //D for Door
		        ImageIcon newClosedImage = new ImageIcon("../levelSprites/closedDoor.png");
			ImageIcon newOpenImage = new ImageIcon("../levelSprites/openDoor.png");
			newObject = new Door(i, currentY, newClosedImage, newOpenImage);
			System.out.print("D");
		    } else if(currentLine.charAt(i) == '.'){ //. for floor
		        ImageIcon newImage = new ImageIcon("../levelSprites/floor.png");
			newObject = new EmptySpace(i, currentY, newImage);
			System.out.print(".");
		    } else{ //else is completely empty space, transparent sprite
		        ImageIcon newImage = new ImageIcon("../levelSprites/empty.png");
			newObject = new EmptySpace(i, currentY, newImage);
			System.out.print(" ");
		    }
		    if(newObject != null){
			levelObjects.add(newObject);
		    }
		}
		System.out.println("");
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
