package academy.learnProgramming.codingExercise;

public class Exercise3BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfTheDay){
        if (hourOfTheDay < 0){
            return false;
        } else if (isBarking && hourOfTheDay < 8) {
            return true;
        } else if (isBarking && hourOfTheDay ==23) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }
}
