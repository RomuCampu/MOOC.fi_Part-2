
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
     ArrayList<Card> cards = new ArrayList<Card>();

  cards.add( new Card(3, Card.CLUBS) );
  cards.add( new Card(2, Card.DIAMONDS) );
  cards.add( new Card(14, Card.CLUBS) );
  cards.add( new Card(12, Card.HEARTS) );
  cards.add( new Card(2, Card.CLUBS) );

  SortAgainstSuit suitSorter = new SortAgainstSuit();
  Collections.sort(cards, suitSorter );

  for (Card c : cards) {
    System.out.println( c );
  }
    }
}
