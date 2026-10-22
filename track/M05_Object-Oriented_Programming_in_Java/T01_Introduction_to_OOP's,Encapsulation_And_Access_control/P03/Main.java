
import java.util.Scanner;

class Product {

    private double price;

    Product(double price) {
        // Store the value
        this.price = price;
    }

    // Create getPrice()
    public double getPrice() {
        return price;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read price
        double price = scanner.nextDouble();
        // Create Product
        Product p = new Product(price);
        // Print the price through the getter
        System.out.println(p.getPrice());

    }
}
