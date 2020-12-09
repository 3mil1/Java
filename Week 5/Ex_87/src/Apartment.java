public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;


    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        int first = this.pricePerSquareMeter * this.squareMeters;
        int second = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        if (first > second) {
            return first - second;
        } else {
            return second - first;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int first = this.pricePerSquareMeter * this.squareMeters;
        int second = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        return first > second;
    }

}
