
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;

    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {

        return subtotal + deliveryCharge;

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Price: ");
        int price = scanner.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter delivery charge: ");
        int deliveryCharge = scanner.nextInt();

        OrderCalculator oc = new OrderCalculator();

        int subtotal = oc.calculateSubtotal(price, quantity);
        int finalTotal = oc.calculateFinalTotal(subtotal, deliveryCharge);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Final Total: " + finalTotal);

    }
}
