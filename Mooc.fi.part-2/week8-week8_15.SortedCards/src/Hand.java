
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    
    private List<Card> hand;
   
    public Hand() {
        hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for(Card c : hand) {
            System.out.println(c);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        
        int total = 0;
        for(Card c : hand) {
            total += c.getValue();
        }
        
        int oTotal = 0;
        for(Card c : o.hand) {
            oTotal += c.getValue();
        }
        
        return total - oTotal;
    }
    
    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sorter = new SortAgainstSuitAndValue();
        Collections.sort(this.hand, sorter);
    }
}
