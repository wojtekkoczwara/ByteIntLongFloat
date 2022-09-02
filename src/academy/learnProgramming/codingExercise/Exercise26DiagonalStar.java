package academy.learnProgramming.codingExercise;

public class Exercise26DiagonalStar {

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if(j == 1 || j == number){
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (j == number - i +1) {
                    System.out.print("*");
                } else if (i ==1 || i == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
    }

}
