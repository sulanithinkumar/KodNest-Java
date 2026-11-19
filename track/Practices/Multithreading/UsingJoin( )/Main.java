
class Main {

    public static void main(String[] args) {

        System.out.println("Main Thread execution started and opened the file");

        Addition add = new Addition();
        PrintingNum pn = new PrintingNum();
        PrintingChar pc = new PrintingChar();

        add.start();
        pn.start();
        pc.start();

        try {
            add.join();
            pn.join();
            pc.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread execution completed and Closed the file");
    }
}
