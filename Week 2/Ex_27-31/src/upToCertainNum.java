import java.util.Scanner;

public class upToCertainNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        System.out.println("Up to what number? ");
        int num = Integer.parseInt(reader.next());

        while (i <= num){
            System.out.println(i);
            i++;
        }
    }
}
