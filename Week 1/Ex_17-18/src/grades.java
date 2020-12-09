import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        while (i <= 1) {
            System.out.println("Type the points [0-60]: ");
            int point = Integer.parseInt(reader.nextLine());

            if (point < 29) {
                System.out.println("failed");
            } else if (point < 34) {
                System.out.println("1");
            } else if (point < 39) {
                System.out.println("2");
            } else if (point < 44) {
                System.out.println("3");
            } else if (point < 49) {
                System.out.println("4");
            } else if (point < 60) {
                System.out.println("5");
            }


            System.out.println("Grade: " + point);
            i++;
        }
    }
}
