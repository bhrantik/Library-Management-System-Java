import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book b) {
        bookList.add(b);
        System.out.println(b.getTitle() + " added to library.");
    }

    public void showAllBooks() {
        System.out.println("\nBooks in Library:");
        for (Book b : bookList) {
            b.showBook();
        }
    }

    public void issueBook(String title) {
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.issue();
                return;
            }
        }
        System.out.println("Book not found in library!");
    }

    public void returnBook(String title) {
        for (Book b : bookList) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found in library!");
    }
}
