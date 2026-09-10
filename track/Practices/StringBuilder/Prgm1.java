
public class Prgm1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Nithin");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" is a Kodnest student");

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Ans hard working guy");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
