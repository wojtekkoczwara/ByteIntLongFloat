package academy.learnProgramming.codingExercise;

public class Exercise23NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0){
            System.out.println("Zero");
            return;
        }


        int lastDigit = 0;
        int reversedNumber = reverse(number);

        int digitCountNumber = getDigitCount(number);
        int digitCountReversedNumber = getDigitCount(reversedNumber);
        int differenceInNumberCount = digitCountNumber - digitCountReversedNumber;

        while (reversedNumber != 0){
            lastDigit =reversedNumber % 10;
            reversedNumber /=10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                    case 1:
                    System.out.println("One");
                    break;
                    case 2:
                    System.out.println("Two");
                    break;
                    case 3:
                    System.out.println("Three");
                    break;
                    case 4:
                    System.out.println("Four");
                    break;
                    case 5:
                    System.out.println("Five");
                    break;
                    case 6:
                    System.out.println("Six");
                    break;
                    case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                default:
                    System.out.println("Nine");
                    break;
            }

        }
        if(differenceInNumberCount != 0){
            for (int i = 0; i < differenceInNumberCount; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        int magnifier = 0;
        int digitCount = 0;
        boolean isNegative = number < 0 ? true : false;
        if (isNegative){
            number = Math.abs(number);
        }

        while (number !=0){
            digitCount = getDigitCount(number) -1;
            magnifier = (int) Math.pow(10, digitCount);
            reversedNumber += (number % 10) * magnifier;
            number /= 10;
        }
        if(isNegative){
            return reversedNumber * (-1);
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }

        int digitCount = 0;

        if(number == 0){
            return digitCount = 1;
        }
        while (number!= 0){
            number /= 10;
            digitCount++;
        }
        return digitCount;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(reverse(100));
        System.out.println("-------------");
        numberToWords(2356);
        System.out.println("----------");
        numberToWords(1234567890);
        System.out.println("----------");
        numberToWords(0);

    }
}
