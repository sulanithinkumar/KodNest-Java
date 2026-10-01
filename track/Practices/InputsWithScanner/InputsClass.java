
import java.util.Scanner;

public class InputsClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Byte Value: ");
        byte a = scan.nextByte();
        System.out.println("Byte value is: " + a);

        System.out.println("Enter Short value: ");
        short b = scan.nextShort();
        System.out.println("Short value is : " + b);

        System.out.println("Enter integer Value: ");
        int c = scan.nextInt();
        System.out.println("Integer value is: " + c);

        System.out.println("Enter long value : ");
        long d = scan.nextLong();
        System.out.println("Long value is: " + d);

        System.out.println("Enter float value: ");
        float e = scan.nextFloat();
        System.out.println("Float value is: " + e);

        System.out.println("Enter double values: ");
        double f = scan.nextDouble();
        System.out.println("Double value is: " + f);

        System.out.println("Enter boolean value: ");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean value is: " + g);

    }

}
