import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type first number: ");
        read = Integer.parseInt(reader.next());
        sum += read;
        System.out.println("Type second number: ");
        read = Integer.parseInt(reader.next());
        sum = sum + read;
        System.out.println("Type third number: ");
        read = Integer.parseInt(reader.next());
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
