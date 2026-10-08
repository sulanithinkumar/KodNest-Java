
public class Main {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        accessMethod(ch1);

        Child2 ch2 = new Child2();
        accessMethod(ch2);

    }

    public static void accessMethod(Parent ref) {
        ref.display1();
        ref.display2();

        if (ref instanceof Child1) {

            ((Child1) (ref)).display3();

        } else {

            ((Child2) (ref)).display3();

        }

    }
}
