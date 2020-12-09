import java.util.Scanner;

public class usernames {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;

        while (i < 3) {
            i++;
            System.out.println("Type your username: ");
            String username = reader.nextLine();
            System.out.println("Type your password: ");
            String password = reader.nextLine();

            if (username.equals("alex") && password.equals("mightyducks")) {
                System.out.println("You are now logged into the system!");
            } else if (username.equals("emily") && password.equals("cat")) {
                System.out.println("You are now logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }
        }
    }
}
