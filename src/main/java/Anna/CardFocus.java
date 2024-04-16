package Anna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardFocus {
    public static ArrayList<Card> readCardListFromText(String file) {

        try {
            Scanner scan = new Scanner(new File(file));
            ArrayList<Card> desk = new ArrayList<>();
            while (scan.hasNext()) {
                String s = scan.next();
                String v  = scan.next();
                Card c = new Card(Suit.valueOf(s), v);
                desk.add(c);

            }
            System.out.println(desk);
            return desk;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
