public class LyyraCard {
    private double balance;
    private double payEconomical = 2.50;
    private double payGourmet = 4.00;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance > payEconomical) {
            this.balance -= this.payEconomical;
        }
    }

    public void payGourmet() {
        if (this.balance > payGourmet) {
            this.balance -= this.payGourmet;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }

        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}
