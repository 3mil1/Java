import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word celery twice");
                break;
            } else {
                words.add(word);
            }
        }
    }
}
