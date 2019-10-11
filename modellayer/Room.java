package modellayer;

/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    private int id;
    private String description;
    /**
     * Constructor for objects of class Room
     */
    public Room(int id, String description)
    {
        this.id = id;
        this.description = description;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getDescription()
    {
        return description;
    }
}
