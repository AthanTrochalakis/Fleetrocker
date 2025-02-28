import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.io.File;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public final class ControlClass extends JFrame{
    private ArrayList<File> levelFiles;
    public ArrayList<Boolean> playerMoves;
    public Level currentLevel;
    public int levelNum;
    public Player player;
    private JLabel backgroundLabel; //creates the label that is moving on the GUI (Character)
    private JLabel playerLabel;
    private JLabel enemyLabel; //creates the label that is moving on the GUI (Enemy)
    
    //JFrame GUI components
    public ControlClass() {
	//Instantiate new level
	this.levelNum = 1;
	this.levelFiles = new ArrayList<>();
	File levelFolder = new File("../levelFiles");
	File[] listOfFiles = levelFolder.listFiles();
	for(int i = 0; i < listOfFiles.length; i++){
	    levelFiles.add(listOfFiles[i]);
	}
	int randomLevel = (int)(Math.random() * levelFiles.size());
	String levelPathName = "../levelFiles/" + levelFiles.get(randomLevel).getName();
	System.out.println("Current level: " + levelPathName);
	this.currentLevel = new Level(levelPathName);

	//Instantiate booleans for which directions player is moving in
	this.playerMoves = new ArrayList<>();
	for(int i = 0; i < 4; i++){
	    this.playerMoves.add(false);
	}

	//Instantiate graphics things
	backgroundLabel = new JLabel();
	backgroundLabel.setBounds(0,0,1920,1080);//Instantiates the label at x and y, with specified width and height
        backgroundLabel.setBackground(Color.BLACK);//sets background color
        backgroundLabel.setOpaque(true);//sets opacity
	
	//Creates a new player object
	this.player = new Player();
	playerLabel = new JLabel();
	player.setSprites("../characterSprites/player");
	playerLabel.setBounds(20, 20, 16, 16);
	playerLabel.setIcon(player.Static);

	Enemy newEnemy = new Enemy();
	enemyLabel = new JLabel();
	newEnemy.setSprites("../characterSprites/enemy");
	enemyLabel.setBounds(10, 10, 16, 16);
	enemyLabel.setIcon(newEnemy.Static);

	//A bunch of stuff for setting up the properties of the JFrame
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1920, 1080);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	this.setUndecorated(true);
	this.setLayout(null);
	this.setVisible(true);//sets the frame visible
	this.add(backgroundLabel);//add label to GUI
    }

    public void runFrame(){
	//update player movement based on playerMoves
		if(this.playerMoves.get(0)){
		    this.player.setY(this.player.getY() - 10);
		}
		if(this.playerMoves.get(1)){
		    this.player.setX(this.player.getX() + 10);
		}
		if(this.playerMoves.get(2)){
		    this.player.setY(this.player.getY() + 10);
		}
		if(this.playerMoves.get(3)){
		    this.player.setX(this.player.getX() - 10);
		}
			
	     
			
		//draw other LevelObjects
    };
}
    




