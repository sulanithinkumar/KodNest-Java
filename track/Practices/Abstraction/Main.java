
public class Main {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        accessMethod(ch1);
        accessMethod(ch2);
    }

    static void accessMethod(Parent ref) {

        ref.display1();
        ref.display2();

    }
}
