package academy.learnProgramming.codingExercise;

public class Exercise25LargestPrime {

    //wez dzielniki liczby
    // znajdz najwiekszy dzielnik bedacy liczba piewsza
    //jesli dzielnik jest, ale nie jest liczba pierwsza - skip
    // jesli dzielnij jest i jest liczba pierwsza - to on
    //jesli 0 lub 1 - return -1
    //jesli liczba jest liczba pierwsza = zwroc ja

    //algorytm
    //zmienna prime factor = number;
    //wez liczbe number
    //znajdz jej dzielnik (sprawdz czy nie ma reszty z dzielenia)
    //sprawdz czy dzielnik jest liczba pierwsza
    //jesli jest - factor = i

    public static int getLargestPrime(int number){
        int factor = -1;

        if(number <= 0 || number ==1){
            return -1;
        }

        int primeFactor = number;
        for (int i = 2; i < number; i++) {

            //sprawdzam czy liczba jest dzielnikiem
            if(number % i == 0){
                if(i == 2){
                    primeFactor = i;
                } else {
                    for (int j = 2; j < i; j++) {
                        if(i % j == 0){
                            break;
                        } else if (j < i -1 ) {
                        } else
                        {
                            primeFactor = i;
                        }
                    }
                }
            }
        }

        return primeFactor;
    }

    public static boolean isPrime(int number){
        int factor = 1;
        for (int i = 1; i < number/2; i++) {
            if(number % i == 0){
                factor = i;
            }
            if(factor > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(21));
        System.out.println(isPrime(23));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(23));
        System.out.println(getLargestPrime(4));
    }
}
