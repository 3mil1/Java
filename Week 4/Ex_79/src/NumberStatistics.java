public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;


    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
       return this.sum;
    }

    public double average() {
       return (double)this.sum / this.amountOfNumbers;
    }
}
