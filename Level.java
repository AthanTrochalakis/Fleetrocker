import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * A class for handling levels in Fleetrocker
 *
 * @author Athan Trochalakis
 * @version 2/20/2025
 */
public class Level{
    int levelNum;
    ArrayList<LevelObject> levelObjects;
    //ArrayList<Enemy> enemies;
    //ArrayList<Equipment> equipment;

    public Level(String levelFileName){
	this.levelNum = 1;
	this.levelObjects = new ArrayList<LevelObject>();
	try{
	    File levelData = new File(levelFileName);
	    Scanner levelReader = new Scanner(levelData);
	    int currentY = 0;
	    while(levelReader.hasNextLine()){
		String currentLine = levelReader.nextLine();
		boolean teleporterAdded = false;
		for(int i = 0; i < currentLine.length(); i++){ //i can act as X position
		    LevelObject newObject = null;
		    if(currentLine.charAt(i) == 'T'){
			if(!teleporterAdded){
			    newObject = new Teleporter(i, currentY, true);
			} else{
			    newObject = new Teleporter(i, currentY, false);
			}
			teleporterAdded = !teleporterAdded;
		    } else if(currentLine.charAt(i) == '#'){
			newObject = new Wall(i, currentY);
		    } else if(currentLine.charAt(i) == 'D'){
			newObject = new Door(i, currentY);
		    } else{
			newObject = new EmptySpace(i, currentY, currentLine.charAt(i));
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

    public String getLayout(int playerX, int playerY){
	String colorCancel = "\u001B[0m";
	String levelLayout = "";
	for(int i = 0; i < this.levelObjects.size(); i++){
	    if(levelObjects.get(i).getXPos() == playerX && levelObjects.get(i).getYPos() == playerY){
		levelLayout += "\u001B[32m" + "@" + colorCancel;
	    } else{
		levelLayout += levelObjects.get(i).getColor() +
		    levelObjects.get(i).toString() + colorCancel;
	    }
	    if(i < this.levelObjects.size() - 1){
		if(levelObjects.get(i + 1).getYPos() > levelObjects.get(i).getYPos()){
		    levelLayout += "\n";
		}
	    }
	}
	return levelLayout;
    }
}
