import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String text) {
        return text.equals(reverse(text));
    }


    public static String reverse(String text) {
        String help = "";
        int len = text.length();
        int i = 0;

        while (len > i) {

            char c = text.charAt(len - 1);
            help = help + c;
            len--;
        }

        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

}
