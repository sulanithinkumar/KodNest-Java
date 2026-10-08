
public class Main {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    // upcasting
    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();

    }
}
