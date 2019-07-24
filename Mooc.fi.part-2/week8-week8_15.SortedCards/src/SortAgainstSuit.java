import java.util.Comparator;

public class SortAgainstSuit implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        return card1.getSuit()-card2.getSuit();
    }
}
