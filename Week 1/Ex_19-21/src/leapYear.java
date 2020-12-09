import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        while (i < 3) {
            i++;
            System.out.println("Type a year: ");
            int year = Integer.parseInt(reader.nextLine());

            int sum = year % 4;

            if ( (year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        }
    }
}
