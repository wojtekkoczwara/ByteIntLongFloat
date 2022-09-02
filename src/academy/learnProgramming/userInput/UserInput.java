package academy.learnProgramming.userInput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2018 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println(name + " " + age);
            } else {
                System.out.println("incorrect Age");
            }
        } else {
            System.out.println("No number given, other sign given. Give me a number");
        }

        scanner.close();

    }
}
