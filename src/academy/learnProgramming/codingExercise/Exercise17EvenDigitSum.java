package academy.learnProgramming.codingExercise;

public class Exercise17EvenDigitSum {
    public static int  getEvenDigitSum(int number){
        int sum = 0;

        if (number < 0){
            return -1;
        }

        if (number > 0 && number <= 9){
            if (number % 2 == 0)
            return number;
        }
        int lastNumber = 0;
        while (number != 0)
        {
            lastNumber = number % 10;
            if(lastNumber %2 == 0){
                sum += lastNumber;
            }
            number /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(15632));
    }
}
