
public class Main {

    public static void main(String[] args) {
        Monkey m = new Monkey();

        m.eat();  // overridden method
        m.sleep(); // Inherited method

        Lion l = new Lion();

        l.eat(); // overridden method
        l.sleep(); // Inherited method

    }
}
