import java.util.*;
public class ControlClass extends JFrame implements KeyListener {

JLabel = label; //creates the label that is moving on the GUI

//JFrame GUI components

MyFrame() {

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(,);//set the size of the frame
this.setLayout(null);
this.addKeyListener(this);
this.setVisible(true);//sets the frame visible


label = new JLabel();
label.setBounds(x,y,width,height);//Instantiates the label at x and y, with specified width and height
label.setBackroundColor();//sets backround color
label.setOpaque(true);//sets opacity

this.add(label);//add label to GUI
this.setVisible(true);//Set visible


//Creates a new player object
Player One = new Player();
One.setSprite(/Users/maxwellmurata/Desktop/cs240/LabProject/PlayerSprites);
One.Static;




//Method to move label left,right,up,down

@Override
public void keyTyped(KeyEvent e) {

switch(e.getKeyChar())
    
case 'a': label.setLocation(.getX()-10, label.getY());
break;
case 'w': label.setLoaction(.getX(), label.getY()-10);
break;
case 's': label.setLocation(.getX(), label.getY()+10);
break;
case 'd': label.setLocation(.getX()+10), label.getY()); 
break;

}



