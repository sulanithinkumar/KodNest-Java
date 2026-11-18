
class PrintingNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing num activity started...");

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing num activity completed...");
    }
}
