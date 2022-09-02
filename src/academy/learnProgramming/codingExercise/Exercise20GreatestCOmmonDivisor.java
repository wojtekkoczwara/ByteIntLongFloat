package academy.learnProgramming.codingExercise;

public class Exercise20GreatestCOmmonDivisor {
    public static int getGreatestCommonDivisor(int a, int b){
        if ((a < 10) || b < 10){
            return -1;
        }

        int greatestCommonDivisor = 0;
        int divisorA = 0;
        int divisorB = 0;
        for (int i = 1; i < a; i++) {
            divisorA = a % i == 0 ? i : divisorA;
            divisorB = b % i == 0 ? i : divisorB;
//            for (int j = 0; j < b; j++) {
//                divisorB = b % j == 0 ? i : divisorB;
//            }
            greatestCommonDivisor = divisorA == divisorB ? divisorA : greatestCommonDivisor;
        }
        return greatestCommonDivisor;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}
