package Anna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardFocus {
    public static ArrayList<Card> readCardListFromText(String file){

        try {
            Scanner scanner = new Scanner(new File(file));
            ArrayList<Card> desk = new ArrayList<>();
            while(scanner.hasNext()) {

                //Card c =new Card(scanner.nextLine(), scanner.next());
                //desk.add(c);
            }
            return desk;
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }


}
