import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        while (i <= 1) {

            System.out.println("Type a number: ");
            int number = Integer.parseInt(reader.nextLine());

            int sum = number % 2;

            System.out.println(sum);

            if (sum != 1) {
                System.out.println("Number " + number + " is even");
                i++;
            } else {
                System.out.println("Number " + number + " is odd");
            }
        }
    }
}

