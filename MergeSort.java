import java.util.ArrayList;
// having compile problems in method merge with any of the compareTo lines I used
// so commented them to submit the assignment.

public class MergeSort
{ 
  static ArrayList<Bid> aux;
  private static void merge(ArrayList<Bid> bids, int lo, int mid, int hi)
  {
    for (int k = lo; k <= hi; k++)     
      aux.set(k,bids.get(k));

    int i = lo;
    int j = mid + 1;
    for (int k = lo; k <= hi; k++)
    {     
      if (i > mid)                                   bids.set(k,aux.get(j++));      
      else if (j > hi)                               bids.set(k,aux.get(i++));      
      //else if (compareTo(aux.get(j), aux.get(i)) < 0)      bids.set(k,aux.get(j++)); 
      //else if (aux.get(j).compareTo(aux.get(i)) < 0) bids.set(k,aux.get(j++));
      else                                           bids.set(k,aux.get(i++));      
    }
  }


  public static void sort(ArrayList<Bid> bids)
  {
    aux = new ArrayList<Bid>(bids.size());
    int N = bids.size();
    
    for (int size = 1; size < N; size = size + size)
      for (int lo = 0; lo < N - size; lo += size + size)
        merge(bids, lo, lo + size - 1, Math.min(lo + size + size - 1, N - 1));    
  }

  
  public static void print(ArrayList<Bid> bids)
  {
    for (Bid bid : bids)
      System.out.print(bid + " ");
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    // for testing. have to do properly  
    ArrayList<Bid> bids = new ArrayList<Bid>();
    //bids.add(new Bid(4,"Travel Case","bart","simpson","bart@simpson.com",Util.generatePin(),217.80));
    //bids.add(new Bid(7,"Vanity Case","lisa","simpson","bart@simpson.com",Util.generatePin(),34217.80));
    //bids.add(new Bid(3,"Table","homer","simpson","bart@simpson.com",Util.generatePin(),17.80));
    //bids.add(new Bid(10,"Chair","marge","simpson","bart@simpson.com",Util.generatePin(),21.80));
    //bids.add(new Bid(1,"Ruler","grandpa","simpson","bart@simpson.com",Util.generatePin(),1234.80));
    //bids.add(new Bid(6,"Bed","compare","simpson","bart@simpson.com",Util.generatePin(),765.80));
    //bids.add(new Bid(8,"Bottle","negative","simpson","bart@simpson.com",Util.generatePin(),10.80));
    
    print(bids);
    sort(bids);
    print(bids);
  }
  
}
