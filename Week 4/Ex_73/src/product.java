public class product {
    private final String name;
    private final double price;
    private final int amount;


    public product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct(){
        System.out.println(this.name + "," + this.price + "," + this.amount);
    }
}
