

/**
 * Class to manage bids
 * A bid comprises:
 * an item or lot being bid for
 * a bidder
 * an amount being bid or offered for the lot
 * 
 * @author jf
 * @version 14.3.2015
 *
 */
public class Bid
{

    Lot lot;
    Person bidder;
    final int amountBid;

    /**
     * 
     * @param lot the subject of the bid
     * @param bidder person bidding
     * @param amountBid amount bid for lot
     */
    public Bid(Lot lot, Person bidder, int amountBid)
    {
      // TODO 1 Initialize all fields      
      this.amountBid = amountBid;
      this.lot       = lot;
      this.bidder    = bidder;      
    }
    
    /**
     * Accessor for amountBid field
     * @return The amount of this bid
     */
    public int getAmountBid()
    {
      return amountBid;
    }
    
    /**
     * Constructs a string representation of this object
     * @return string representation of this object
     */    
    public String toString()
    {
      // TODO 2 Implement this method
      return "Bid: bidder is " + bidder.email + ": amount bid is "
              + amountBid + ": Lot description " + lot.description + "\n";
    }
}
