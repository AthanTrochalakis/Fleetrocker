public class ControlClass extends JFrame implements KeyListener {
    
    JLabel  label; //creates the label that is moving on the GUI (Character)
    JLabel  enemyLabel; //creates the label that is moving on the GUI (Enemy)
    public  ArrayList<> level = new ArrayList<> ();
    
    //JFrame GUI components
    
    MyFrame() {
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(,);//set the size of the frame
	this.setLayout(null);
	this.addKeyListener(this);
	this.setVisible(true);//sets the frame visible
	
	
	label = new JLabel();
	label.setBounds(0,0,16,16);//Instantiates the label at x and y, with specified width and height
	label.setBackroundColor(Color.white);//sets backround color
	label.setOpaque(true);//sets opacity
	
	this.add(label);//add label to GUI
	this.setVisible(true);//Set visible
	
	//Creates a new player object
	Player One = new Player();
	One.setSprite(/Users/maxwellmurata/Desktop/cs240/LabProject/PlayerSprites);
	label.setIcon(One.Static);


	Enemy enemy = new Enemy();
	enemy.setSprite(/Users/maxwellmurata/Desktop/cs240/LabProject/EnemySprites);
	enemyLabel.setBounds(10,10,16,16);
	enemyLabel.setIcon(enemy.Static);

	
	
    }


    public void level(ArrayList<LevelObject> List) {

	for(int i = 0; i < list.size(); i++) {
	    JLabel label = new JLabel;
	    label.setBounds(list(i).getXPos(),list(i).getYPos(),list(i).getSize(),list(i).getSize());
	    label.setIcon(list(i).getImage());
	    level.add(label);
	   
	}


	
    }

    

    //Method to move label left,right,up,down
    
    @Override
    public void keyTyped(KeyEvent e) {
	
	switch(e.getKeyChar()) {
	    
	case 'a': label.setLocation(label.getX()-10, label.getY());
		break;
	case 'w': label.setLoaction(label.getX(), label.getY()-10);
	    break;
	case 's': label.setLocation(label.getX(), label.getY()+10);
	    break;
	case 'd': label.setLocation(label.getX()+10), label.getY()); 
	break;
    }






    
}
    




