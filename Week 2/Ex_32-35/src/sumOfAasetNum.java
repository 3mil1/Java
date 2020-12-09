import java.util.Scanner;

public class sumOfAasetNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int until = Integer.parseInt(reader.next());

//        int i = 1;
//        int sum = 0;
//        while (i <= until) {
//            sum += i;
//            i++;
//        }


        int i = 1;
        int sum = 0;

        while (i <= until) {
            sum = sum + i;
            i++;  // means the same as i = i + 1;
        }
        System.out.println("Sum is " + sum);
    }
}
