package controllerlayer;
import modellayer.*;
import java.util.ArrayList;

/**
 * Write a description of class ItemController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemController
{
    private ItemContainer itemContainer;
    
    /**
     * Constructor for objects of class ItemController
     */
    public ItemController()
    {
        itemContainer = ItemContainer.getInstance();
    }
    
    public Item createItem(String name, Room roomItemIsIn)
    {
        Item item = new Item(name, roomItemIsIn);
        itemContainer.addItem(item);
        return item;
    }
    
    public ArrayList<Item> findItems(Room room)
    {
        return itemContainer.findItems(room);
    }
    
    public Item findItem(int roomId, String name)
    {
        RoomController roomCtrl = new RoomController();
        return findItem(roomCtrl.findRoom(roomId), name);
    }
    
    public Item findItem(Room room, String name)
    {
        return itemContainer.findItem(room, name);
    }
}
