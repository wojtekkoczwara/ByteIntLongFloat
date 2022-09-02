package academy.learnProgramming.codingExercise;

public class Exercise14SumOdd {
    public static boolean isOdd(int number){
        if(number <=0){
            return false;
        }
        if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end < start || start <= 0 ){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(100, 1000));
    }
}
