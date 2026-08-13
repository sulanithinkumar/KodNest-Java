
import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {

        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {

        return distance * 5 + expressFee;

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance: ");
        int distance = scanner.nextInt();
        System.out.println("Enter express fee: ");
        int expressFee = scanner.nextInt();

        DeliveryCalculator dc = new DeliveryCalculator();

        int charge = dc.calculateCharge(distance);
        int expressCharge = dc.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + charge);
        System.out.println("Express Charge: " + expressCharge);

    }

}
