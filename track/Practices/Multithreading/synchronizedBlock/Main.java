
class Main {

    public static void main(String[] args) {

        Hospital h = new Hospital();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);

        t1.setName("TOM");
        t2.setName("JERRY");

        t1.start();
        t2.start();
    }
}
