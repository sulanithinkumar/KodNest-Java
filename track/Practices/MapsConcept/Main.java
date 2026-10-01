
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        /*
        freq.put('a', 1);
        freq.put('b', 1);
        freq.put('c', 1);

        System.out.println(freq);

        freq.put('a', freq.getOrDefault('a', 0) + 1);

        System.out.println(freq);

        freq.put('d', freq.getOrDefault('d', 0) + 1);

        System.out.println(freq);

        for (int i = 1; i <= 10; i++) {
            freq.put('a', freq.getOrDefault('a', 0) + 1);
            freq.put('b', freq.getOrDefault('b', 0) + 1);
            freq.put('c', freq.getOrDefault('c', 0) + 1);
        }
        System.out.println(freq);
         */
        char a[] = {'a', 'a', 'b', 'c', 'c'};
        char b[] = {'a', 'a', 'b', 'c', 'c'};

        for (int i = 0; i < a.length; i++) {

            freq1.put(a[i], freq1.getOrDefault(a[i], 0) + 1);

        }

        for (int i = 0; i < b.length; i++) {

            freq2.put(b[i], freq2.getOrDefault(b[i], 0) + 1);

        }
        System.out.println(freq1);
        System.out.println(freq2);

        if (freq1.equals(freq2)) {
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }
        boolean res = freq1.equals(freq2);

        System.out.println(res);

    }
}
