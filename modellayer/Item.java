package modellayer;

/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String name;
    private Room inRoom;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String name, Room inRoom)
    {
        this.name = name;
        this.inRoom = inRoom;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Room getRoomItemIsIn()
    {
        return inRoom;
    }
}