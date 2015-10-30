

import java.util.ArrayList;
import java.util.Collections;

/**
 * Selection sort applied to a list of Bid objects
 * Sorts bids in ascending order with reference to bid amounts
 * @author j. fitzgerald
 * @version 17.3.2015
 */
public class SelectSort
{
  /**
   * Sorts list of bids in ascending order
   * @param bids The list of bids
   */
  public static void sort(ArrayList<Bid> bids)
  {
    for (int i = 0; i < bids.size(); i += 1)
      for (int j = i; j < bids.size(); j += 1)
        if (compareTo(bids.get(j), bids.get(i)) < 0)
            exchange(bids, i, j);
  }
  
  /**
   * Swaps Bid elements in a list of Bid objects
   * Uses the Collection class method swap
   * @link  http://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
   * @param bids The list of Bid objects
   * @param i The position in the list of the first object
   * @param j The position in the list of the second object
   */
  public static void exchange(ArrayList<Bid> bids, int i, int j)
  {
    Collections.swap(bids, i, j);
  }
  
  /**
   * Compares 2 Bid objects with refernce to the bid amount fields
   * @param bid1 The first bid object
   * @param bid2 The second bid object
   * @return Negative one if bid1 < bid2, zero if same, positive number if bid1 > bid2
   */
  public static int compareTo(Bid bid1, Bid bid2)
  {
    if (bid1.amountBid < bid2.amountBid)
      return -1;
    if (bid1.amountBid == bid2.amountBid)
      return 0;
    return 1;
  }
}
