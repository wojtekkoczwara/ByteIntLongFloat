package academy.learnProgramming.codingExercise;

public class Exercise18SharedDigit {
    public static boolean  hasSharedDigit(int number1, int number2){

        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)){
            return false;
        }

        int lastNumber1 = 0;
        int lastNumber2 = 0;
        int compareNumber1 = number1;
        int compareNumber2 = number2;
        while (number1 != 0)
        {
            lastNumber1 = number1 % 10;
            number2 = compareNumber2;
            while (number2 !=0){
                lastNumber2 = number2 % 10;
                number2 /= 10;
                if (lastNumber1 == lastNumber2){
                    return true;
                }
            }

            number1 /= 10;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(13, 33));
    }
}
