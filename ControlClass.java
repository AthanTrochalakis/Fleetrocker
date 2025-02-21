import java.util.*;

//This class implements the KeyListener interface

public class ControlClass implements KeyListener {

// TODO Method to move sprite left,right,up,down
//.set and .get need to be filled in with  obejct name

public void characterMove(KeyEvent e) {
switch(e.getKeyChar())
case 'a': .setLocation(.getX()-10, .getY());
break;
case 'w': .setLoaction(.getX(), .getY()-10);
break;
case 's': .setLocation(.getX(), .getY()+10);
break;
case 'd': .setLocation(.getX()+10), .getY()); 
break;

}



