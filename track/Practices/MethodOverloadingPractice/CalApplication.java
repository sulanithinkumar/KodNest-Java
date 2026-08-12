
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, int b, double c) {
        return a + b + c;
    }

    double add(int a, double b, int c) {
        return a + b + c;
    }

    double add(int a, double b, double c) {
        return a + b + c;
    }

    double add(double a, int b, int c) {
        return a + b + c;
    }

    double add(double a, int b, double c) {
        return a + b + c;
    }

    double add(double a, double b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

}

public class CalApplication {

    public static void main(String[] args) {
        Addition a = new Addition();
        var res = a.add(45, 5.22, 5.56);
        System.out.printf("%.2f", res);

    }

}
