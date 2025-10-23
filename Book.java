public class Book {
    private String title;
    private String author;
    private boolean issued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issue() {
        if (!issued) {
            issued = true;
            System.out.println(title + " is issued successfully.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    public void returnBook() {
        if (issued) {
            issued = false;
            System.out.println(title + " is returned successfully.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    public void showBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Issued: " + issued);
    }
}
