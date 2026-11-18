
class Main {

    public static void main(String[] args) {

        /*
        Addition add = new Addition();
        PrintingNum printNum = new PrintingNum();
        PrintingChar printChar = new PrintingChar();

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(printNum);
        Thread t3 = new Thread(printChar);
         */
 /*
        Thread t1 = new Thread(new Addition());
        Thread t2 = new Thread(new PrintingNum());
        Thread t3 = new Thread(new PrintingChar());
        
        t1.start();
        t2.start();
        t3.start();
         */
        new Thread(new Addition()).start();
        new Thread(new PrintingNum()).start();
        new Thread(new PrintingChar()).start();

    }
}
