package academy.learnProgramming.codingExercise;

public class Exercise10EqualityPrinter {
    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        } else if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a !=c && b !=c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        printEqual(2, 3, 4);
    }
}
