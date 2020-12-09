import java.util.Scanner;

public class firstPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.next();
        System.out.println("Length of the first part: ");
        int length = Integer.parseInt(reader.next());



        System.out.println("Result: " + word.substring(length-1));

    }
}
