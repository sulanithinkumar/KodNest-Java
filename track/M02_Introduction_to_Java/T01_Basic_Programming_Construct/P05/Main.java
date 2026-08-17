
public class Main {

    public static void main(String[] args) {
        short completedTopics = 17;
        short totalTopics = 20;
        short dailyLearningHours = 3;
        short learningDays = 5;

        int remainingTopics = totalTopics - completedTopics;
        int weeklyLearningHours = dailyLearningHours * learningDays;
        double progressPercentage = completedTopics * 100 / totalTopics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);

    }
}
