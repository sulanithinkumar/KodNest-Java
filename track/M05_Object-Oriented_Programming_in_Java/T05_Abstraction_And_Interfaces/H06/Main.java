
import java.util.Scanner;

interface Readable {

    void read();
}

interface Writable {

    void write();
}

class Notebook implements Readable, Writable {

    String name;

    Notebook(String name) {
        this.name = name;
    }

    @Override
    public void read() {
        System.out.println(name + " opened");
    }

    @Override
    public void write() {
        System.out.println(name + " saved");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Notebook note = new Notebook(name);

        note.read();
        note.write();
    }
}
