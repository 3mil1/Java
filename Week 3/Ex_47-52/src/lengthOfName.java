import java.util.Scanner;

public class lengthOfName {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.next();
        System.out.println("Number of characters: " + name.length());

    }
}
