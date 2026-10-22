
import java.util.Scanner;

class Attendance {

    private short presentDays;

    public void addDays(short days) {

        if (days > 0) {
            presentDays += days;
        }
    }

    public short getPresentDays() {

        return presentDays;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short days = scanner.nextShort();

        Attendance attend = new Attendance();

        attend.addDays(days);

        System.out.println(attend.getPresentDays());
    }
}
