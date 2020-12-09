import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt((reader.nextLine()));

        System.out.println("Division: " + number + "/" + number2 + "=" + ((double)number/number2));
    }
}
