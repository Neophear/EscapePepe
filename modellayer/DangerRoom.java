package modellayer;


/**
 * Write a description of class DangerRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DangerRoom extends Room
{
    // instance variables - replace the example below with your own
    private int damage;
    /**
     * Constructor for objects of class DangerRoom
     */
    public DangerRoom(int id, String description, int damage)
    {
        super(id, description);
        this.damage = damage;
        // initialise instance variables
    }
}
