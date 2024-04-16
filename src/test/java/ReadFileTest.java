import Anna.Card;
import Anna.CardFocus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReadFileTest {
    @Test
    public void testReadFile() {
        Card c1 = new Card(Anna.Suit.HEARTS, "10");
        List<Card> fact = new ArrayList<>();
        fact.add(c1);

        Assertions.assertIterableEquals(fact, CardFocus.readCardListFromText("INPUT.txt"));
    }
}
