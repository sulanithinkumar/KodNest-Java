
class Child extends Parent {

    Child() {
        this(10);
        System.out.println("From child class, 0 para constructor");
    }

    Child(int a) {
        this(12, 31);
        System.out.println("From child class, 1 para constructor");
    }

    Child(int a, int b) {
        System.out.println("From child class, 2 para constructor");
    }
}
