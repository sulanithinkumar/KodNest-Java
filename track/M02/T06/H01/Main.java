
import java.util.Scanner;

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Author Name: ");
        String author = scanner.nextLine();

        Book b = new Book(title, author);

        b.display();
    }
}
