package modellayer;

/**
 * Write a description of class Key here.
 *
 * @author Stiig
 * @version 04/04
 */
public class Key
{
    private String description;
    private Item inItem;
    private Door opensDoor;
    
    /**
     * Constructor for objects of class Key
     */
    public Key(String description, Item inItem, Door opensDoor)
    {
        this.description = description;
        this.inItem = inItem;
        this.opensDoor = opensDoor;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public Item getItemThatKeyIsIn()
    {
        return inItem;
    }
    
    public Door getDoorThatKeyOpens()
    {
        return opensDoor;
    }
}
