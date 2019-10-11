package controllerlayer;
import modellayer.*;

/**
 * Write a description of class PlayerController here.
 *
 * @author (Stefan)
 * @version (a version number or a date)
 */
public class PlayerController
{
    // instance variables - replace the example below with your own
    private Player player;

    /**
     * Constructor for objects of class PlayerController
     */
    public PlayerController()
    {
     //this.player = player;
    }
    
    public void createplayer(String name){
    Player player = new Player(name);
    }
    

}
