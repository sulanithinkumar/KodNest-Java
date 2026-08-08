
public class Main {

    public static void main(String[] args) {
        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        outer:
        for (int i = 1; i <= practiceDays; i++) {

            inner:
            for (int j = 1; j <= sessionsPerDay; j++) {

                if (i == revisionDay) {
                    continue inner;
                }
                if (i == practiceDays && j > finalDaySessionLimit) {
                    break;
                }
                System.out.println("Day " + i + " - Session " + j);
                completedSessions += 1;
            }
        }
        String status = completedSessions == targetSessions ? "Target Achieved" : "Target Pending";

        System.out.println("Completed Sessions: " + completedSessions);
        System.out.println(status);
    }
}
