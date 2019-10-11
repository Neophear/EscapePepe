package modellayer;
import java.util.ArrayList;
/**
 * Write a description of class RoomContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomContainer
{
    // instance variables - replace the example below with your own
    private static RoomContainer instance;
    private ArrayList<Room> rooms;
    /**
     * Constructor for objects of class RoomContainer
     */
    private RoomContainer()
    {
        // initialise instance variables
        rooms = new ArrayList<>();
    }
    public static RoomContainer getInstance()
    {
        if (instance == null)
            instance = new RoomContainer();
        return instance;
    }
    
    public void addRoom(Room room)
    {
        rooms.add(room);
    }
    
    public Room findRoom(int id)
    {
        boolean found = false;
        int index = 0;
        while(!found && index < rooms.size())
        {
            Room currentRoom = rooms.get(index);
            if(currentRoom.getId() == id)
            {
                found = true;
            } 
            else 
            {
                index++;
            }
        }
        
        if (found)
        {
            return rooms.get(index);
        }
        else
        {
            return null;
        }
    }
}
