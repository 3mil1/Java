import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDistribution distribution = new GradeDistribution();

        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }

            distribution.addScore(score);
        }

        distribution.result();
    }
}
