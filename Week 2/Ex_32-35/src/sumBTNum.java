import java.util.Scanner;

public class sumBTNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.next());
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.next());

        int sum = 0;

        while (first <= second) {
            sum += first;
            first++;
        }
        System.out.println("The sum is: " + sum);
    }

}
