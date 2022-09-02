package academy.learnProgramming.codingExercise;

public class Exercise22PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                sum += i;
            }
        }
        if (sum == number){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

}
