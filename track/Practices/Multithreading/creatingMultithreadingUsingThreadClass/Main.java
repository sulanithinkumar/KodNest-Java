
class Main {

    public static void main(String[] args) {

        Addition add = new Addition();
        PrintingNum printNum = new PrintingNum();
        PrintingChar printChar = new PrintingChar();

        add.start();;
        printNum.start();
        printChar.start();
    }
}
