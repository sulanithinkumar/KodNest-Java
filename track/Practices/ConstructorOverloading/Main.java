
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Anu";
        age = 21;
        height = 5.2;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Student(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height + "\n");
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();

        Student s2 = new Student("Nithin");

        s2.display();

        Student s3 = new Student("Kumar", 21, 5.6);

        s3.display();

        Student s4 = new Student("Bijay", 21);

        s4.display();

    }

}
