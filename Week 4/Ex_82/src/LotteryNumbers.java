import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private final ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random random = new Random();

        while (this.numbers.size() < 7) {
            int r = random.nextInt(39);
            if (!containsNumber(r)) {
                this.numbers.add(r);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}