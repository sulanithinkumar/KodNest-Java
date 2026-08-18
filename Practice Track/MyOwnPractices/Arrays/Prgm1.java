
class Editor {

    void change(int data[]) {

        data[1] = 50;
        data = new int[2];
        data[0] = 99;

    }

}

public class Prgm1 {

    public static void main(String[] args) {

        int values[] = {10, 20};

        Editor ed = new Editor();

        ed.change(values);

        System.out.println(values[0] + " " + values[1]);

    }
}
