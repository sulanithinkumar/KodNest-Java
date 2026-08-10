
class StudentApplication {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "nithin";
        s1.height = 5.6;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleeping();
        System.out.println("");

        Student s2 = new Student();
        s2.roll = 102;
        s2.name = "Kumar";
        s2.height = 5.9;
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);
        s2.run();
        s2.sleeping();

    }
}
