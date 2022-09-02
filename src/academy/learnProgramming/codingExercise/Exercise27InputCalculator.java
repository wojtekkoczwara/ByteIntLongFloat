package academy.learnProgramming.codingExercise;

import java.util.Scanner;

public class Exercise27InputCalculator {

    public static void  inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int counter = 0;
        String text = "";
        while (counter < 6){
            boolean isAnInt = scanner.hasNextInt();
            counter++;
            if(isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                avg = Math.round(sum/counter);
            } else {
                text = scanner.next();
            }

//            if(text.equals("break")){
//                    break;
//            }

            scanner.nextLine();
        }
        scanner.close();

        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage2();
    }

    public static void inputThenPrintSumAndAverage2(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int number =0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                number = scanner.nextInt();
                // scanner.nextLine(); // this is not necessary!
                sum += number;
                count++;
            }else{
                // scanner.nextLine(); // this is not necessary!
                break;
            }
            // scanner.nextLine(); // this tells the program, that the user hit the return key and is done with the input for an integer that was assigned to number in line 13
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }

}
