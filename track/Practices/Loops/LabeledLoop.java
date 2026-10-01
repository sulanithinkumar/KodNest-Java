
public class LabeledLoop {

    public static void main(String[] args) {
        Outer:
        for (int i = 1; i <= 3; i++) {

            Inner:
            for (int j = 1; j <= 4; j++) {

                if (i == 3) {
                    break;
                }
                System.out.println("i:" + i + " j: " + j);
            }
        }
    }
}
