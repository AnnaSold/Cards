package Anna;

import Anna.Suit;

import java.util.ArrayList;

public class Card {
    private Suit suit;
    String value;

    public Card(Suit suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    String getSuite() {
        switch (suit) {
            case HEARTS:
                return "Червы";
            case DIAMONDS:
                return "Бубны";
            case CLUBS:
                return "Крести";
            case SPADES:
                return "Пики";
            default:
                return "Undefined";
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value='" + value + '\'' +
                '}';
    }

    public Suit getSuit() {
        return suit;
    }

   public String getValue() {
       return value;
    }
    public static int findEquelCards(ArrayList<Card> cards){
    for(Card c: cards){
        cards.sort(new ValueEqueleComparator());
        System.out.println(c);
    }
        return 0;
    }

}
