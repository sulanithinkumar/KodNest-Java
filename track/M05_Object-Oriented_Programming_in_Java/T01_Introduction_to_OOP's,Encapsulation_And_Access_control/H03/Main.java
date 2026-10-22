
import java.util.Scanner;

class Product {

    private double price;

    public boolean setPrice(double price) {

        if (price >= 0) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {

        return price;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();

        Product product = new Product();

        boolean result = product.setPrice(price);

        if (result) {
            System.out.println(product.getPrice());
        } else {
            System.out.println("Invalid price");
        }

    }
}
