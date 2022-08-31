package academy.learnProgramming.codingExercise;

import java.text.DecimalFormat;

public class Exercise5areEqualToThreeDecimalPlaces {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
//        DecimalFormat df = new DecimalFormat("#,###");
//        double number1Rounded = Double.parseDouble(df.format(number1));
//        double number2Rounded = Double.parseDouble(df.format(number2));
//        System.out.println(number1Rounded + " " + number2Rounded);
//        return number1Rounded == number2Rounded;
        if (Math.abs(number1 - number2) < 0.0009) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, -3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

    }
}
