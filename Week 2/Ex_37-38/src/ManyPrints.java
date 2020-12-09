import java.util.Scanner;

public class ManyPrints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.next());
        int i = 0;
        while (i < num) {
            System.out.println("In the beginning there were the swamp, the hoe and Java.");
            i++;
        }
    }

    public static void printText() {

    }
}
