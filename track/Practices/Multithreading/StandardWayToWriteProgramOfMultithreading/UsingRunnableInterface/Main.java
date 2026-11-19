
class Main {

    public static void main(String[] args) {
        Activity ac = new Activity();

        Thread t1 = new Thread(ac);
        Thread t2 = new Thread(ac);
        Thread t3 = new Thread(ac);

        t1.setName("ADD");
        t2.setName("NUM");
        t3.setName("CHAR");

        t1.start();
        t2.start();
        t3.start();

    }
}
