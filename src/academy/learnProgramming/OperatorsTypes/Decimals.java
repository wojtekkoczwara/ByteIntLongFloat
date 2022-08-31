package academy.learnProgramming.OperatorsTypes;

import java.util.Arrays;

public class Decimals {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Maximum value = " + myMaxDoubleValue);
        System.out.println("Double Minimum value = " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5. / 3;
        double myDoubleValue = 5d / 3;
        System.out.println(myIntValue + " " + + myFloatValue + " " + myDoubleValue);

        double numberOfPounds = 44;
        double scaler = 0.45359237;
        double result = numberOfPounds * scaler;
        System.out.println(result);

        double pi = 3.1415927d;
        double anotherNumber = 3000000.4567890;
        System.out.println(pi + " " +  anotherNumber);

    }
}
