package Anna;

import java.util.ArrayList;
import java.util.Comparator;

import static Anna.Suit.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card c1 = new Card(HEARTS, "10");
        Card c2 = new Card(SPADES, "3");
        Card c3 = new Card(DIAMONDS, "8");
        Card c4 = new Card(CLUBS, "Q");
        ArrayList<Card> desk = new ArrayList<>();
        desk.add(c1);
        desk.add(c2);
        desk.add(c3);
        desk.add(c4);
        System.out.println(desk);
        }

    }
