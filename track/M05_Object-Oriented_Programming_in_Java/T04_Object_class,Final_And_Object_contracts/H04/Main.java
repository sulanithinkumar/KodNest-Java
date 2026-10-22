
import java.util.Scanner;

class Book {

    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    // Override equals()
    public boolean equals(Object obj) {
        Book b = (Book) obj;

        if (this.bookId == b.bookId) {
            return true;
        } else {
            return false;
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        // Compare two Book objects
        Book b1 = new Book(firstId);
        Book b2 = new Book(secondId);

        if (b1.equals(b2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }
}
