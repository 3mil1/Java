import java.util.Scanner;

public class ageCheck {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.println("How old are you? ");
            int age = Integer.parseInt(reader.nextLine());

            if(age > 0 && age < 120) {
                System.out.println("Ok");
            } else {
                System.out.println("Impossible");
                return;
            }
        }
    }
}
