package modellayer;
import java.util.ArrayList;

/**
 * Write a description of class ItemContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemContainer
{
    private static ItemContainer instance;
    private ArrayList<Item> items;
    
    /**
     * Constructor for objects of class ItemContainer
     */
    private ItemContainer()
    {
        // initialise instance variables
        items = new ArrayList<>();
    }
    
    public static ItemContainer getInstance()
    {
        if (instance == null)
            instance = new ItemContainer();
        
        return instance;
    }
    
    public void addItem(Item item)
    {
        items.add(item);
    }
    
    public ArrayList<Item> findItems(Room room)
    {
        ArrayList<Item> foundItems = new ArrayList<>();
        
        for (Item i : items)
            if (i.getRoomItemIsIn() == room)
                foundItems.add(i);
        
        return foundItems;
    }
    
    public Item findItem(Room room, String name)
    {
        boolean found = false;
        int index = 0;
        
        while (!found && index < items.size())
        {
            Item currentItem = items.get(index);
            
            if (currentItem.getRoomItemIsIn() == room && currentItem.getName() == name)
                found = true;
            else
                index++;
        }
        
        return found ? items.get(index) : null;
    }
}
