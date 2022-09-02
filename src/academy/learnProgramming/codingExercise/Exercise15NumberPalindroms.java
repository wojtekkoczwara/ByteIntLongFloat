package academy.learnProgramming.codingExercise;

import java.util.logging.SocketHandler;

public class Exercise15NumberPalindroms {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int initNumber = number;
        while (initNumber != 0)
        {
            lastDigit = initNumber % 10;
            reverse *= 10;
            reverse = reverse + lastDigit;
            initNumber /= 10;
        }
        if (reverse == number){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
}
