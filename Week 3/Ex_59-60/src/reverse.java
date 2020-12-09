import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                break;
            }
            words.add(word);
        }
        System.out.println("You typed the following words: ");
        Collections.reverse(words);
        for (String w : words) {
            System.out.println(w);
        }
    }
}
