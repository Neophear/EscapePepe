package controllerlayer;
import modellayer.*;

/**
 * Write a description of class KeyController here.
 *
 * @author Stiig
 * @version 04/04
 */
public class KeyController
{
    private KeyContainer keyContainer;
    
    /**
     * Constructor for objects of class KeyController
     */
    public KeyController()
    {
        keyContainer = KeyContainer.getInstance();
    }
    
    public Key createKey(String description, Item item, Door door)
    {
        Key key = new Key(description, item, door);
        keyContainer.addKey(key);
        
        return key;
    }
    
    public Key findKey(Item item)
    {
        return keyContainer.findKey(item);
    }
    
    public Key findKey(Door door)
    {
        return keyContainer.findKey(door);
    }
}