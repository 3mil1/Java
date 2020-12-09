import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        GradeDistribution distribution = new GradeDistribution();

        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            distribution.addAScore(luku);
        }

        distribution.tulosta();
    }
}
