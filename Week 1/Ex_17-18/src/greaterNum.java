import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        while (true) {
            System.out.println("Type the first number: ");
            int num = Integer.parseInt(reader.nextLine());
            System.out.println("Type the second number: ");
            int num2 = Integer.parseInt(reader.nextLine());

            if (num > num2) {
                System.out.println("Greater number: " + num);
            } else if (num < num2) {
                System.out.println("Greater number: " + num2);
            } else {
                System.out.println("The numbers are equal!");
                return;
            }
        }
    }
}
