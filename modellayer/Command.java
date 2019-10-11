package modellayer;

/**
 * Write a description of class Command here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Command
{
    // instance variables - replace the example below with your own
    private CommandWord firstWord;
    private String secondWord;

    /**
     * Constructor for objects of class Command
     */
    public Command()
    {
        
    }
    
    public static Command parseCommand(String line)
    {
        String[] words = line.split("\\s+");
        Command result = new Command();
        
        try
        {
            result.setFirstWord(CommandWord.valueOf(words[0].toUpperCase()));
        }
        catch (IllegalArgumentException e)
        {
            result.setFirstWord(CommandWord.UNKNOWN);
        }
        
        
        return result;
    }
    
    public void setFirstWord(CommandWord firstWord)
    {
        this.firstWord = firstWord;
    }
    
    public CommandWord getFirstWord()
    {
        return firstWord;
    }
    
    public void setSecondWord(String secondWord)
    {
        this.secondWord = secondWord;
    }
    
    public String getSecondWord()
    {
        return secondWord;
    }
}
