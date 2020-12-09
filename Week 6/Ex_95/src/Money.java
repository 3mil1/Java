public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euroSum = euros + added.euros();
        int centSum = cents + added.cents();

        if (centSum > 99) {
            centSum -= 100;
            euroSum++;
        }

        return new Money(euroSum, centSum);
    }


    public boolean less(Money compared) {
        return this.euros < compared.euros;
    }

    public Money minus(Money decremented) {
        int e = euros - decremented.euros;
        int c = cents - decremented.cents;

        if (c > 99) {
            c +=  100;
            e++;
        }

        if (e < 0) {
            return new Money(0, 0);
        } else {
            return new Money(e, c);
        }


    }

    //И, наконец, создайте метод public Money minus (Money Decremented),
    // который возвращает новый объект Money, значение которого равно объекту,
    // для которого был вызван метод, за вычетом объекта, указанного в качестве параметра.
    // Если значение будет отрицательным, результирующий объект Money должен иметь значение 0.
}