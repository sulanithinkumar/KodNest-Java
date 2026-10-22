import java.util.Scanner;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {

    String name;

    Dog(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + " says Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        
        Animal animal = new Dog(name);

        animal.sound();
    }
}
