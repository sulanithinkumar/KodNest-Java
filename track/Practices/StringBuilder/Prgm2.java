
public class Prgm2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Sindhu");

        sb.ensureCapacity(100);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);

        sb.append(" is a CyberSecurity student");

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);

        sb.insert(0, "Muthuluri ");
        System.out.println(sb);

        sb.insert(sb.length(), " at MedhaTech");
        System.out.println(sb);

        sb.setCharAt(0, 'm');
        System.out.println(sb);

        sb.delete(0, 10);
        System.out.println(sb);

        sb.deleteCharAt(10);
        System.out.println(sb);

        sb.replace(0, 10, "Muthuluri");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
