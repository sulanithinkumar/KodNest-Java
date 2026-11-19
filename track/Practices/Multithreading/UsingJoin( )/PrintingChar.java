
class PrintingChar extends Thread {

    @Override
    public void run() {
        System.out.println("Priting char activity started and using the file");

        for (char i = 'A'; i <= 'M'; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Printing char activity completed and stopped using the file");
    }
}
