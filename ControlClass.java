import java.util.*;
public class ControlClass extends JFrame implements KeyListener {

    
//JFrame GUI components

MyFrame() {

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(,);//set the size of the frame
this.setLayout(null);
this.addKeyListener(this);
this.setVisible(true);//sets the frame visible


//Creates a new player object
Player One = new Player();
One.setSprite(/Users/maxwellmurata/Desktop/cs240/LabProject/PlayerSprites);
One.Static;




//Method to move label left,right,up,down

@Override
public void keyTyped(KeyEvent e) {

switch(e.getKeyChar())
    
case 'a': One.setLocation(One.getX()-10, One.getY());
break;
case 'w': One.setLoaction(One.getX(), One.getY()-10);
break;
case 's': One.setLocation(One.getX(), One.getY()+10);
break;
case 'd': One.setLocation(One.getX()+10), One.getY()); 
break;

}



