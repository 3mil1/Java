public class Least {
    public static int least(int number1, int number2) {

        int least = Math.min(number1, number2);

        return least;
    }

    public static void main(String[] args) {
        int answer =  least(2, 7);
        System.out.println("Least: " + answer);
    }
}
