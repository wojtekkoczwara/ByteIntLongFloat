package academy.learnProgramming.codingExercise;

import java.util.Scanner;

public class Exercise27InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int a = 0;
        int counter = 0;
        while(true){
            if(scanner.hasNextInt()){
                a = scanner.nextInt();
            } else {
                break;
            }
            counter++;
            sum += a;
            avg = Math.round((sum / counter));

        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
