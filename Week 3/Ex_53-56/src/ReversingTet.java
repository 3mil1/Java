import java.util.Scanner;

public class ReversingTet {
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
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
