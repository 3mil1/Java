public class GradeDistribution {

    private final int[] grades;

    public GradeDistribution() {
        grades = new int[6];
    }

    public void addScore(int score) {
        if (score < 0 || score > 60) {
            return;
        }

        int theGrade = grade(score);
        grades[theGrade]++;
    }

    public void result() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grades[i]));
        }
        System.out.println("Acceptance percentage: " + acceptancePercentage());
    }

    private String stars(int n) {
        String num = "";
        for (int i = 0; i < n; i++) {
            num += "*";
        }
        return num;
    }

    private int grade(int score) {

        if (score < 30) {
            return 0;
        }
        if (score < 35) {
            return 1;
        }
        if (score < 40) {
            return 2;
        }
        if (score < 45) {
            return 3;
        }
        if (score < 50) {
            return 4;
        }
        return 5;
    }

    private double acceptancePercentage() {
        double all = 0;
        for (int number : grades) {
            all += number;
        }
        double failed = grades[0];

        return 100 * (all - failed) / all;
    }

}
