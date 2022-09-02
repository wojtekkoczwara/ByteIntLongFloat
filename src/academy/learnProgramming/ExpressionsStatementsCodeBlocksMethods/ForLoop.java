package academy.learnProgramming.ExpressionsStatementsCodeBlocksMethods;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 0; i < 5; i ++){
            System.out.println("loop " + i + " hello!");
        }

        for (int i = 0; i < 5; i ++){
            System.out.println("loop " + i + " hello!");
        }

        for (int i = 2; i <9; i ++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int primeNumbersFound = 0;
        for (int i = 0; i < 10; i++) {
            if(isPrime(i)){
                System.out.println("prime number is " + i);
                primeNumbersFound++;
            }
            if (primeNumbersFound == 3){
                break;
            }
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i < 1001; i++){
            if(i % 3 == 0){
                if (i % 5 == 0){
                    System.out.println(i);
                    sum += i;
                    count++;
                }
            }
            if (count >=5){
                break;
            }
        }
        System.out.println(sum);

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1 || n == 0){
            return false;
        }

        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
