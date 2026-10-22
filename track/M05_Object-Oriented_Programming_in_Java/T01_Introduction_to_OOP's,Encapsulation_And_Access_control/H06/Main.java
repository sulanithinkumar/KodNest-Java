
import java.util.Scanner;

class BankAccount {

    private double balance;

    BankAccount(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {

        return balance;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double openingBalance = scanner.nextDouble();
        double withdrawalAmount = scanner.nextDouble();

        BankAccount account = new BankAccount(openingBalance);

        account.withdraw(withdrawalAmount);
        System.out.println(account.getBalance());
    }
}
