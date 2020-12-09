public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day = this.day + 1;

        if (this.day > 30) {
            this.month = this.month + 1;
            this.day = 1;

            if (this.month > 12) {
                this.year = this.year + 1;
                this.month = 1;
            }
        }
    }

    public void advance(int numberOfDays) {
        int laskuri = 0;
        while (laskuri < numberOfDays) {
            this.advance();
            laskuri = laskuri + 1;
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate date = new MyDate(this.day, this.month, this.year);

        int counter = 0;
        while (counter < days) {
            date.advance();
            counter = counter + 1;
        }

        return date;
    }
}
