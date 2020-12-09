public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int valueFirst;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueFirst = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.valueFirst;
    }
}
