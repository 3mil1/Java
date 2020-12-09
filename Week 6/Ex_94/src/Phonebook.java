import java.util.ArrayList;

public class Phonebook {

    private final ArrayList<Person> list;

    public Phonebook() {
        list = new ArrayList<>();
    }


    public void add(String name, String number) {
        list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }

        return "number not known";
    }
}
