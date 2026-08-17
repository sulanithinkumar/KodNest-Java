
public class Main {

    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        String res = marks >= 60 && attendance >= 75 ? "Placement Ready" : "Continue Preparation";
        System.out.println(res);

        for (practiceDays = 1; practiceDays <= 3; practiceDays++) {

            System.out.println("Practice Day: " + practiceDays);

        }

    }
}
