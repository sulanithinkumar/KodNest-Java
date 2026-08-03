
public class Main {

    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double reportValue = solvedProblems;
        int wholePercentage = (int) exactPercentage;
        double averagePerDay = reportValue / practiceDays;

        boolean dailyTargetReached = false;
        if (averagePerDay >= 9.0) {
            dailyTargetReached = true;
        }
        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + averagePerDay);
        System.out.println("Daily Target Reached: " + dailyTargetReached);

    }
}
