
import java.util.Scanner;

class Payment {

    public void pay(int amount) {
        System.out.println("Payment " + amount);
    }
}

class CardPayment extends Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Card " + amount);
    }
}

class CashPayment extends Payment {

    @Override
    public void pay(int amount) {
        System.out.println("Cash " + amount);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        int amount = scanner.nextInt();

        Payment pm;

        if (choice == 1) {
            pm = new CardPayment();
        } else {
            pm = new CashPayment();
        }

        pm.pay(amount);
    }
}
