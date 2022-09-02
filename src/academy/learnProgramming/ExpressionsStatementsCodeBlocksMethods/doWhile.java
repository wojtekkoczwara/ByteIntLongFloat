package academy.learnProgramming.ExpressionsStatementsCodeBlocksMethods;

public class doWhile {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6){
            System.out.println("count values is " + count);
            count++;
        }

        count = 1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("count values is " + count);
            count++;
        }

        count = 1;
        //do-while
        do{
            System.out.println("Count value was " + count);
            count++;
        } while (count !=6);

        //challenge
        int number = 0;
        int finishNumber = 20;
        while (number <= finishNumber){
            number++;
           if( !isEvenNumber(number)){
               continue;
           };
            System.out.println("Even number " + number);
        }

        System.out.println(sumDigits(1345));
        System.out.println(sumDigits(2576));
    }

    public static boolean isEvenNumber(int number){
        if(number <=0){
            return false;
        }
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static int sumDigits(int number){
        if(number >= 0 && number <= 9){
            return -1;
        } else if (number > 10 && number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number > 0){
                // extract least significant digit
                int digit = number % 10;
                sum += digit;
                //drop least-significant digit
                number /= 10;
            }
            return sum;
        }
    }

}
