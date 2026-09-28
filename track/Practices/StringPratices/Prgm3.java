
public class Prgm3 {

    public static void main(String[] args) {
        String s1 = "Sindhu";

        System.out.println(s1);

        char ch[] = s1.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        String res = new String(ch);
        System.out.println(res);
    }
}
