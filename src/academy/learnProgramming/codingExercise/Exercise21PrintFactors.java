package academy.learnProgramming.codingExercise;

public class Exercise21PrintFactors {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printFactors(10);
    }

}
