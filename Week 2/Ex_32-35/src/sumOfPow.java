import java.util.Scanner;

public class sumOfPow {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a num: ");
        int num = Integer.parseInt(reader.next());

        int result = 0;
        int i = 0;
        while (i <= num) {
            int pow = (int) Math.pow(2, i);
            result += pow;
            i++;
        }
        System.out.println(result);
    }
}

