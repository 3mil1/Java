import java.util.Scanner;

public class separatingFirstChar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.next();

        int i = 0;
        if(name.length() > 2) {
            while (i < 3) {
                char c = name.charAt(i);
                System.out.println(i+1 + " character: " + c);

                i++;
            }
        }
    }
}
