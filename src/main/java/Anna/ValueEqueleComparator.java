package Anna;

import java.util.Comparator;

public class ValueEqueleComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {

        return o1.getValue().compareTo(o2.getValue());
    }
}
