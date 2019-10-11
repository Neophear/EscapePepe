package modellayer;

/**
 * Write a description of class Door here.
 *
 * @author Stiig
 * @version 04/04
 */
public class Door
{
    // instance variables - replace the example below with your own
    private Room inRoom;
    private Direction direction;
    private Room nextRoom;
    
    /**
     * Constructor for objects of class Door
     */
    public Door(Room room, Direction direction, Room nextRoom)
    {
        this.inRoom = room;
        this.direction = direction;
        this.nextRoom = nextRoom;
    }
    
    public Room getRoomDoorIsIn()
    {
        return inRoom;
    }
    
    public Direction getDirection()
    {
        return direction;
    }
    
    public Room getNextRoom()
    {
        return nextRoom;
    }
}