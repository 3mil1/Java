import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.next());
        int i = 1;
        int sum = 1;

        while (i <= n) {
            sum *= i;
            i++;
        }
        System.out.println(sum);

    }
}
