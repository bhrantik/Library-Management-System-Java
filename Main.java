import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Adding few books
        lib.addBook(new Book("Java Programming", "James Gosling"));
        lib.addBook(new Book("Learn Python", "Guido Rossum"));
        lib.addBook(new Book("C++ Basics", "Bjarne Stroustrup"));

        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show All Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            sc.nextLine(); // to consume newline

            switch (ch) {
                case 1:
                    lib.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String t1 = sc.nextLine();
                    lib.issueBook(t1);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String t2 = sc.nextLine();
                    lib.returnBook(t2);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (ch != 4);

        sc.close();
    }
}
