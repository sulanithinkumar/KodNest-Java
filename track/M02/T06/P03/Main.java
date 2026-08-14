
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();

        Product p = new Product(name, price);

        p.display();

    }
}
