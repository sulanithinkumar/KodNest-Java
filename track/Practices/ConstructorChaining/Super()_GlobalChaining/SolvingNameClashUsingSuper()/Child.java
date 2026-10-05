
class Child extends Parent {

    int a = 20;

    void display() {
        System.out.println("Parent a : " + super.a);
        System.out.println("Child a : " + a);

    }
}
