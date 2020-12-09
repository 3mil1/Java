public class Counter {
    private int num;
    private boolean tt;

    public Counter(int startingValue, boolean check) {
        this.num = startingValue;
        this.tt = check;

    }

    public Counter(int startingValue) {
        this.num = startingValue;
        this.tt = true;
    }

    public Counter(boolean check) {
        this.num = 0;
        this.tt = check;
    }

    public Counter() {
        this.num = 0;
        this.tt = false;
    }

    public int value() {
        return this.num;
    }

    public void increase() {
        if (this.tt && this.num >= 0) {
            this.num++;
        }
    }

    public void decrease() {
        if (this.num >= 0) {
            this.num--;
        }
    }
}