package academy.learnProgramming.codingExercise;

public class Exercise9MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){
        String result = "Invalid Value";
        if(minutes >= 0){
            long day = minutes/(24*60);
            long year = day / 365;
            long daysLeft = day % 365;
            result = minutes + " min = " + year + " y and " + daysLeft + " d";
        }
        System.out.println(result);
    }
}
