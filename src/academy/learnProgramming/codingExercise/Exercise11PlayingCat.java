package academy.learnProgramming.codingExercise;

public class Exercise11PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean result = false;
        if(summer == true && (temperature >= 25 && temperature <= 45)){
            result = true;
        } else if (summer == false && (temperature >= 25 && temperature <= 35)){
            result = true;
        }
        return result;
    }
}
