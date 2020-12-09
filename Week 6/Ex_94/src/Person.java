public class Person {

    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return this.name.toString() + " number: " + this.number.toString();
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
}
