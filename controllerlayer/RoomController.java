package controllerlayer;
import modellayer.*;

/**
 * Write a description of class RoomController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoomController
{
    // instance variables - replace the example below with your own
    RoomContainer roomContainer;
    /**
     * Constructor for objects of class RoomController
     */
    public RoomController()
    {
        // initialise instance variables
      roomContainer = RoomContainer.getInstance();
    }
    
    public Room createRoom(int id, String description)
    {
        Room room = new Room(id, description);
        roomContainer.addRoom(room);
        return room;
    }
    
    public DangerRoom createDangerRoom(int id, String description, int damage)
    {
        DangerRoom dangerRoom = new DangerRoom(id, description, damage);
        roomContainer.addRoom(dangerRoom);
        return dangerRoom;
    }
    
    public Room findRoom(int id)
    {
        return roomContainer.findRoom(id);
    }
    
    
}
