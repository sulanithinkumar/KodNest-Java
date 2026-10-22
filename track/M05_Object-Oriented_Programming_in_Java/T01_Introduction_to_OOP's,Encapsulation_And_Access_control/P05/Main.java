
import java.util.Scanner;

class BankAccount {

    private double balance;

    BankAccount(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double openingAmount = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();

        BankAccount account = new BankAccount(openingAmount);

        account.deposit(depositAmount);

        System.out.println(account.getBalance());
    }
}
