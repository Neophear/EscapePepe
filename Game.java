import uilayer.*;
import controllerlayer.*;
import modellayer.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private RoomController roomCtrl;
    private DoorController doorCtrl;
    private ItemController itemCtrl;
    private KeyController keyCtrl;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        roomCtrl = new RoomController();
        doorCtrl = new DoorController();
        itemCtrl = new ItemController();
        keyCtrl = new KeyController();
        
        createRooms();
        createDoors();
        createItems();
        createKeys();
    }

    private void createRooms()
    {
        roomCtrl.createRoom(1, "Du vågner op i et koldt og mørkt rum.");
        roomCtrl.createRoom(2, "Du lugter og der er muggent. Du ser en spand på gulvet.");
        roomCtrl.createRoom(3, "Du ser en luge over dig");
        roomCtrl.createDangerRoom(4, "Du træder i en bjørnefælde. Den kapper dit ben.", 10);
        roomCtrl.createRoom(105, "Første stue rum"); 
    }
    
    private void createDoors()
    {
        doorCtrl.createDoor(1, Direction.WEST, 2);
        doorCtrl.createDoor(1, Direction.EAST, 3);
        doorCtrl.createDoor(1, Direction.SOUTH, 4);
        doorCtrl.createDoor(2, Direction.EAST, 1);
        doorCtrl.createDoor(3, Direction.WEST, 1);
        doorCtrl.createDoor(3, Direction.NORTH, 105);
        doorCtrl.createDoor(4, Direction.NORTH, 1);
        
    }
    
    private void createItems()
    {
        itemCtrl.createItem("Spand", roomCtrl.findRoom(2));
    }
    
    private void createKeys()
    {
        keyCtrl.createKey("Rød nøgle", itemCtrl.findItem(2, "Spand"), doorCtrl.findDoor(3, Direction.NORTH));
    }
}
