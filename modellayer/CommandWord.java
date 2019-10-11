package modellayer;

/**
 * Enumeration class CommandWord - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum CommandWord
{
    HELP, GO, QUIT, UNKNOWN;
    
    public String toString()
    {
        switch(this)
        {
            case HELP:
                return "help";
            case GO:
                return "go";
            case QUIT:
                return "quit";
            case UNKNOWN:
                return "unknown";
            default:
                return null;
        }
    }
}