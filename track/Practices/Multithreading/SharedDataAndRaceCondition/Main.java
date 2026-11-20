
class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer);
        Thread t3 = new Thread(printer);

        t1.setName("Java Developer");
        t2.setName("Python Developer");
        t3.setName("C Developer");

        t1.start();
        t2.start();
        t3.start();

    }
}
