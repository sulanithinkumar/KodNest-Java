
public class StudentApplication {

    public static void main(String[] args) {

        Student s1 = new Student(4, "nithin");
        Student s2 = new Student(11, "sindhu");
        Student s3 = new Student(4, "nithin");

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.getClass());
        System.out.println(s3.getClass());
    }
}
