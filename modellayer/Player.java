package modellayer;


/**
 * Write a description of class Player here.
 *
 * @author (Stefan)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables
    private int lives;
    private String name;
    private Key key;
    private Room room;

    /**
     * Constructor for objects of class PLayer
     */
    public Player(String name)
    {
        // initialise instance variables
        this.name = name;
        this.lives = 50;
    }
    
    public void setRoom(Room room)
    {
        this.room = room;
    }
    
    public void setKey(Key key)
    {
        this.key = key;
    }
    
    public void takeDamage()
    {
        takeDamage(1);
    }
    
    public void takeDamage(int amount)
    {
        this.lives -= amount;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Room getRoom()
    {
        return room;
    }
    
    public Key getKey()
    {
        return key;
    }
    
    public int lives()
    {
        return lives;
    }
}
