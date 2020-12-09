import java.util.ArrayList;

public class Library {

    private final ArrayList<Book> books;


    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();


        for (Book f : books) {
            if (StringUtils.included(f.title(), title)) {
                found.add(f);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        

        for (Book f : books) {
            if (StringUtils.included(f.publisher(), publisher)) {
                found.add(f);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book f : books) {
            if (f.year() == year) {
                found.add(f);
            }
        }

        return found;
    }
}
