import java.util.ArrayList;
import java.io.File;

/**
 * Runs Fleetrocker
 *
 * @author Athan Trochalakis
 * @version 2/27/2025
 */
public class Fleetrocker{
    
    public static void main(String[] args){
	ArrayList<File> levelFiles = new ArrayList<>();
        File levelFolder = new File("../levelFiles");
	File[] listOfFiles = levelFolder.listFiles();
	for(int i = 0; i < listOfFiles.length; i++){
	    levelFiles.add(listOfFiles[i]);
	}
	//for(int i = 0; i < levelFiles.size(); i++){
	// System.out.println("Found file: " + levelFiles.get(i).getName());
	//}

	int randomLevel = (int)(Math.random() * levelFiles.size());
	//System.out.println("Displaying " + levelFiles.get(randomLevel).getName());
	Level newLevel = new Level("../levelFiles/" + levelFiles.get(randomLevel).getName(), 1);

	ControlClass newControl = new ControlClass();
	newControl.level(newLevel.getLayout());
    }
}
