/**
 * Just a class for running level classes
 *
 * @author Athan Trochalakis
 * @version 2/21/2025
 */
public class Runner{
    public static void main(String[] args){
	if(args.length == 1){
	    Level myLevel = new Level(args[0]);
	    System.out.println(myLevel.getLayout(5, 5));
	}
    }
}
