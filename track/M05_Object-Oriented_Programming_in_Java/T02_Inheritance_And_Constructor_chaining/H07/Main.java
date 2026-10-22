
import java.util.Scanner;

class Account {

    private int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber) {

        super(accountNumber);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount(scanner.nextInt());

        System.out.println(sa.getAccountNumber());
    }
}
