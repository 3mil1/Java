public class avgOfNum {
    public static double average(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        double avg = (double) sum / 4;
        return avg;
    }

    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }

}
