import java.util.Scanner;

public class Adder {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of the numbers: " + (number + number2));
    }

}
