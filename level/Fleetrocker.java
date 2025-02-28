import java.util.ArrayList;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Runs Fleetrocker
 *
 * @author Athan Trochalakis
 * @version 2/27/2025
 */
public class Fleetrocker{
    public static ControlClass newControl;
    
    public static void main(String[] args){
	newControl = new ControlClass();
	Timer gameClock = new Timer();
	gameClock.scheduleAtFixedRate(new TimerTask(){
		public void run(){
		    newControl.setVisible(true);
		    newControl.runFrame();
		}
	    },
	    0, 1000);
    }
}
