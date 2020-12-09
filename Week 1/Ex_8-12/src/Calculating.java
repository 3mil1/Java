import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: " );
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("Circumference og the circle: " + (2 * Math.PI * number));
    }
}
