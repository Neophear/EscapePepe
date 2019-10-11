package modellayer;
import java.util.ArrayList;

/**
 * Write a description of class KeyContainer here.
 *
 * @author Stiig
 * @version 04/04
 */
public class KeyContainer
{
    private static KeyContainer instance;
    private ArrayList<Key> keys;
    
    /**
     * Constructor for objects of class KeyContainer
     */
    private KeyContainer()
    {
        keys = new ArrayList<>();
    }
    
    public static KeyContainer getInstance()
    {
        if (instance == null)
            instance = new KeyContainer();
        
        return instance;
    }
    
    public void addKey(Key key)
    {
        keys.add(key);
    }
    
    /**
     * Finds a key that is in item. Returns null if nothing found.
     */
    public Key findKey(Item item)
    {
        return findKey(item, null);
    }
    
    /**
     * Finds a key that opens door. Returns null if nothing found.
     */
    public Key findKey(Door door)
    {
        return findKey(null, door);
    }
    
    private Key findKey(Item item, Door door)
    {
        boolean found = false;
        int index = 0;
        
        while (!found && index < keys.size())
        {
            Key currentKey = keys.get(index);
            
            if ((item != null && currentKey.getItemThatKeyIsIn() == item)
                || (door != null && currentKey.getDoorThatKeyOpens() == door))
                found = true;
            else
                index++;
        }
        
        return found ? keys.get(index) : null;
    }
}