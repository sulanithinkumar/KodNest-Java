
class Printer implements Runnable {

    @Override
    synchronized public void run() {

        try {

            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " started using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " is using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " stooped using printer");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
