public class BoundedCounter {

    private int value;
    private final int limit;

    public BoundedCounter(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void next() {
        if (this.value == this.limit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.limit) {
            return;
        }

        this.value = value;
    }

    @Override
    public String toString() {
        String initialZero = "0";
        if (this.value > 9) {
            initialZero = "";
        }
        return initialZero + this.value;
    }
}
