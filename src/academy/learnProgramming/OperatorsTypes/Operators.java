package academy.learnProgramming.OperatorsTypes;

public class Operators {



    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);
         result++;

         boolean isAlien = false;
         if (isAlien == false){
             System.out.println("It's not an alien");
         }

         int topScore = 90;
         if (topScore != 100){
             System.out.println("You got the high score!");
         }
         if (topScore >= 100){
             System.out.println("You got the high score! > 100");
         }

         int secondTopScore = 60;
         if (topScore > secondTopScore && topScore < 100){
             System.out.println("greaten than second top score and less than 100");
         }

         //operator precedence
        if (topScore > 90 || secondTopScore <= 90){
            System.out.println("either or both are true");
        }

        boolean isCar =false;
        if (isCar){
            System.out.println("not should happen");
        } else {
            System.out.println("this too shouldn't happen");
        }

        //ternary operator
        boolean wasCar = isCar ? true : false;

        System.out.println("----------------Challenge-----------");

        double number1 = 20.00;
        double number2 = 80.00;
        double result2 = (number2 + number1)*100;
        double result3 = result2 % 40.00;
        System.out.println(result3);

        boolean result4 = result3 == 0;
        System.out.println(result4);

        if(result4 != true){
            System.out.println("Got some reminder");
        }
    }
}
