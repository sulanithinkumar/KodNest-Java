
class Main {

    public static void main(String[] args) {

        Activity ac1 = new Activity();
        Activity ac2 = new Activity();
        Activity ac3 = new Activity();

        ac1.setName("ADD");
        ac2.setName("NUM");
        ac3.setName("CHAR");

        ac1.start();
        ac2.start();
        ac3.start();

    }
}
