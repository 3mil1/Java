import java.util.Scanner;

public class wordInsideWord {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first = reader.next();
        System.out.println("Type the second word: ");
        String second = reader.next();

        int index = first.indexOf(second);
        if (index != -1) {
            System.out.println("The word " + second + " is found in the word " + first);
        } else {
            System.out.println("The word " + second + " is not found in the word " + first);

        }

    }
}
