
class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

public class EmpApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.id = 101;
        e1.name = "nithin";

        System.out.println(e1.id);
        System.out.println(e1.name);

        e1.work();

        Employee e2 = e1;

        e1.id = 102;
        e1.name = "sindhu";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

    }
}
