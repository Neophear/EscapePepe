package controllerlayer;
import modellayer.*;

/**
 * Write a description of class DoorController here.
 *
 * @author Stiig
 * @version 04/04
 */
public class DoorController
{
    DoorContainer doors;
    
    /**
     * Constructor for objects of class DoorController
     */
    public DoorController()
    {
        doors = DoorContainer.getInstance();
    }
    
    public Door createDoor(int roomId, Direction direction, int nextRoomId)
    {
        RoomController roomCtrl = new RoomController();
        return createDoor(roomCtrl.findRoom(roomId), direction, roomCtrl.findRoom(nextRoomId));
    }
    
    /**
     * Creates a door and returns it.
     */
    public Door createDoor(Room inRoom, Direction direction, Room nextRoom)
    {
        Door door = new Door(inRoom, direction, nextRoom);
        doors.addDoor(door);
        return door;
    }
    
    public Door findDoor(int roomId, Direction direction)
    {
        RoomController roomCtrl = new RoomController();
        return doors.findDoor(roomCtrl.findRoom(roomId), direction);
    }
    
    /**
     * Finds a door from parameters. Returns null if none is found.
     */
    public Door findDoor(Room room, Direction direction)
    {
        return doors.findDoor(room, direction);
    }
}