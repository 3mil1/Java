import java.util.Scanner;

public class lowerLimitUpperLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.next());
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.next());


        while (first <= second) {
            System.out.println(first);
            first++;
        }


    }
}
