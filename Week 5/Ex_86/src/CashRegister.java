public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    private double economicalLunch = 2.50;
    private double gourmetLunch = 4.00;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven >= economicalLunch) {
            this.cashInRegister += economicalLunch;
            this.economicalSold++;
            return cashGiven -= economicalLunch;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= gourmetLunch) {
            this.cashInRegister += gourmetLunch;
            this.gourmetSold++;
            return cashGiven -= gourmetLunch;
        }
        return cashGiven;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= this.economicalLunch) {
            this.economicalSold++;
            card.pay(economicalLunch);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= this.gourmetLunch) {
            this.gourmetSold++;
            card.pay(gourmetLunch);
            return true;
        } else {
            return false;
        }
    }


    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
        }
    }
}
