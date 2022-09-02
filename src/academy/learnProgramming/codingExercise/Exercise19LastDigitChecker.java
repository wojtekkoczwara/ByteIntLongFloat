package academy.learnProgramming.codingExercise;

public class Exercise19LastDigitChecker {
    public static boolean   hasSameLastDigit(int number1, int number2, int number3){
        if (isValid(number1) && isValid(number2) && isValid(number3)){

        } else {
            return false;
        }

        int lastNumber1 = 0;
        int lastNumber2 = 0;
        int lastNumber3 = 0;

        lastNumber1 = number1 % 10;
        lastNumber2 = number2 % 10;
        lastNumber3 = number3 % 10;

        if (lastNumber1 == lastNumber2 || lastNumber1 == lastNumber3 || lastNumber2 == lastNumber3){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number1){
        if (number1 >= 10 && number1 <= 1000){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(99, 333, 338));
    }
}
