
class Hospital implements Runnable {

    String res1 = "Bed";
    String res2 = "Doctor";

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        if (threadName.equals("TOM")) {
            tomTreatment();
        } else {
            jerryTreatment();
        }
    }

    void tomTreatment() {

        try {

            synchronized (res1) {
                System.out.println("Tom is occupied " + res1);
                Thread.sleep(3000);

                synchronized (res2) {
                    System.out.println("Tom has assigned " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Tom has re-assigned " + res2);
            }
            System.out.println("Tom is released " + res1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void jerryTreatment() {
        try {

            synchronized (res2) {
                System.out.println("Jerry is occupied " + res2);
                Thread.sleep(3000);

                synchronized (res1) {
                    System.out.println("Jerry has assigned " + res1);
                    Thread.sleep(3000);
                }
                System.out.println("Jerry has re-assigned " + res1);
            }
            System.out.println("Jerry is released " + res2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
