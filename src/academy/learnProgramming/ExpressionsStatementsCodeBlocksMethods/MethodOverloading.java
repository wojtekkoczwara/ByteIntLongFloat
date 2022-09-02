package academy.learnProgramming.ExpressionsStatementsCodeBlocksMethods;

public class MethodOverloading {

    public static void main(String[] args) {
        int newScore = calculateScore("tim", 3000);
        System.out.println("New Score is " + newScore);

        calculateScore(200);

        System.out.println(calcFeetAndInchesToCentimeters(12));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 13));

        System.out.println(getDurationsString(90, 5));
        System.out.println(getDurationsString(3698));

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    //overloading
    public static int calculateScore(int score){
        System.out.println("Player scored " + score + " points");
        return score*1000;

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inch){
        double result = -1;
        if(feet >= 0 && inch >=0 && inch <= 12){
            result = (feet * 12 + inch)*2.54;
        }
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inch){
        double result = -1;
        if(inch >=0 && inch <= 12){
            result = inch*2.54;
        }
        return result;
    }

    public static String getDurationsString(int minutes, int seconds){
        String result= "Invalid value";
        if(minutes >=0 && (seconds >= 0 && seconds <=59)){
            int minutesFromSeconds = seconds / 60;
            int leftSeconds = seconds % 60;
            int allMinutes = minutes + minutesFromSeconds;
            int hours = allMinutes / 60;
            int minutesLeft = allMinutes % 60;
            String hoursFormatted = String.format("%02d", hours);
            String minutesFormatted = String.format("%02d", minutesLeft);
            String secondsFormatted = String.format("%02d", leftSeconds);
            result = hoursFormatted + "h " + minutesFormatted + "m " + secondsFormatted + "s";
            String hoursString = hours + "h";

        }
            return result;
    }

    public static String getDurationsString(int seconds){
        String result= "Invalid value";
        if(seconds >= 0){
            int minutesFromSeconds = seconds / 60;
            int leftSeconds = seconds % 60;
            return getDurationsString(minutesFromSeconds, leftSeconds);
        }
        return result;
    }
}
