
import java.util.Scanner;

class Book {

    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || !(getClass() == obj.getClass())) {
            return false;
        }

        Book book = (Book) obj;
        return this.bookId == book.bookId;

    }

    @Override
    public int hashCode() {
        return bookId;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        Book b1 = new Book(firstId);
        Book b2 = new Book(secondId);

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());

        scanner.close();
    }
}
