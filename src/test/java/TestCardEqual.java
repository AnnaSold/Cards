import Anna.Card;
import Anna.CardFocus;
import Anna.ValueEqueleComparator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

import static Anna.Suit.*;
import static Anna.Suit.CLUBS;

public class TestCardEqual {
    @Test
    public void equalsCardInDesk(){
        Card c1 = new Card(HEARTS, "10");
        Card c2 = new Card(SPADES, "3");
        Card c3 = new Card(DIAMONDS, "8");
        Card c4 = new Card(CLUBS, "Q");
        ArrayList<Card> desk = new ArrayList<>();
        desk.add(c1);
        desk.add(c2);
        desk.add(c3);
        desk.add(c4);
        Assertions.assertEquals(0,c1.findEquelCards(desk));
    }

}
