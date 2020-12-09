import java.util.Scanner;

public class firstCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.next();
        System.out.println(name.charAt(0) + " " + lastCharacter(name));


    }

    public static char lastCharacter(String name) {
        return name.charAt(name.length() - 1);
    }

}
