import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.println("studentNumber: ");
            String num = reader.nextLine();

            list.add(new Student(name, num));
        }

        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();

        while (true) {
            for (Student s : list) {
                if (s.getName().contains(search)) {
                    System.out.println("Result: " + s);
                    return;
                }
            }
        }
    }
}