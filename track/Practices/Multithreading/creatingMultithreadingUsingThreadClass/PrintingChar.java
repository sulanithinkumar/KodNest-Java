
class PrintingChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing char activity started...");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing char activity completed...");
    }
}
