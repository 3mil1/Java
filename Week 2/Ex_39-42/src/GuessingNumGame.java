import java.util.Random;
import java.util.Scanner;

public class GuessingNumGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        System.out.println(randomInt);

        int i = 1;
        while (true) {
            System.out.println("Guess a number: ");
            int num = Integer.parseInt(reader.next());
            if (num == randomInt) {
                System.out.println("Congratulations, your guess is correct!");
                return;
            } else if (num < randomInt) {
                System.out.println("The number is greater, guesses made: " + i);
            } else {
                System.out.println("The number is lesser, guesses made: " + i);
            }
            i++;
        }

    }

}
