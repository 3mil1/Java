import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LNR {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int i = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            int num = Integer.parseInt(reader.next());
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is: " + sum);
                System.out.println("How many numbers: " + i);
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);
                break;
            } else {
                sum += num;
                i++;
                avg = (double) sum / i;

                if (num % 2 == 0) {
                    even++;
                } else {
                   odd++;
                }
            }
        }
    }
}
