
class Conductor {

    void collect(Money m) {

        System.out.println("Collected");

    }

    Ticket give() {

        Ticket t = new Ticket();
        System.out.println("Gives Ticket");
        return t;

    }

}

class Money {

}

class Ticket {

}

public class Main {

    public static void main(String[] args) {

        Conductor c = new Conductor();

        Money m = new Money();
        c.collect(m);
        Ticket t = c.give();
        System.out.println(t);

        if (t != null) {
            System.out.println("Ticket collected");
        }

    }
}
