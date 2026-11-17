
import java.util.Scanner;

class DrivingLicence {

    int age;

    void takeAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {

        if (age < 18) {

            //UnderAgeException uae = new UnderAgeException();
            //throw uae;
            throw new UnderAgeException();

        } else if (age > 65) {

            throw new OverAgeException();

        } else {
            System.out.println("DL is issued....");
        }
    }
}
