
interface Prgm {

    void run();

    default void walk() {
        System.out.println("walk method");
    }

    static void jump() {
        System.out.println("jump method");
    }

    private void swim() {
        System.out.println("Swim method");
    }

}
