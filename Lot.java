

/**
 * Class to create and manage an auction lot
 * 
 * @author jf
 * @version 14.3.2015
 *
 */
public class Lot
{
    // unique lot id
    final int lotId;
    // a description of the lot
    String description;

    /**
     * Construct a Lot, initializing its number and description.
     * @param number The lot number.
     * @param description A description of this lot.
     */
    public Lot(int lotId, String description)
    {
        this.lotId = lotId;
        this.description = description;
    }
    
    /**
     * Constructs a string representation of this object
     * @return string representation of this object
     */
    public String toString()
    {
        return "Lot id: " + lotId + ": " + description;
    }   
}
