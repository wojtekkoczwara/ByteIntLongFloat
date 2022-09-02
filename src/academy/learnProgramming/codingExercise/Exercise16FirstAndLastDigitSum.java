package academy.learnProgramming.codingExercise;

public class Exercise16FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        int sum = 0;

        if (number < 0){
            return -1;
        }

        if (number > 0 && number <= 9){
            return number + number;
        }

        int lastNumber = number % 10;
        sum = lastNumber;

        int lastDigit = 0;
        while (number != 0)
        {
            number /= 10;
            if(number > 0 && number <= 9){
                sum = lastNumber + number;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(99));
    }
}
