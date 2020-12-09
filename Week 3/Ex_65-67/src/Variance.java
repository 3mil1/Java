import java.util.ArrayList;

public class Variance {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double sum = (double)sum(list);
        return sum / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double aver = average(list);

        double var = 0;
        for (int number : list) {
            double difference = number - aver;
            double squareOfDifference = difference * difference;
            var = var + squareOfDifference;
        }
        var = var / (list.size() - 1);

        return var;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
