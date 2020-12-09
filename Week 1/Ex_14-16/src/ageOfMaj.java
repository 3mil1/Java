import java.util.Scanner;

public class ageOfMaj {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        while (i <= 1) {

            System.out.println("How old are you? ");
            int age = Integer.parseInt(reader.nextLine());

            if (age < 18) {
                System.out.println("You have not reached the age of majority yet!");
                i++;
            } else {
                System.out.println("You have reached the age of majority");
                return;
            }
        }
    }
}
