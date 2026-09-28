
public class Demo {

    static {
        System.out.println("1st static block");
    }

    static {
        System.out.println("2nd static block");
    }

    static {
        System.out.println("3rd static block");
    }

    {
        System.out.println("1st Non-static block");
    }

    {
        System.out.println("2nd Non-static block");
    }

    {
        System.out.println("3rd Non-static block");
    }
}
