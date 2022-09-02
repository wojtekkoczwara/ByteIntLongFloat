package academy.learnProgramming.codingExercise;

public class Exercise24FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal){


        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigCountKilos = 5;
        int smallCountKilos = 1;

        int bigCountCapacity = 0;
        if (bigCount > 0){
            bigCountCapacity = bigCount * bigCountKilos;
        }

        int smallCountCapacity = 0;
        if (smallCount > 0){
            smallCountCapacity = smallCount*smallCountKilos;
        }

        int capacityTotal = bigCountCapacity + smallCountCapacity;

        if(capacityTotal < goal){
            return false;
        }

        int leftovers = goal;
        if (bigCount > 0) {
            int bigBagsLeft = bigCount;
            while (bigBagsLeft > 0) {
                leftovers = leftovers - bigCountKilos;
                if (bigBagsLeft > 0 && leftovers <= 0 && leftovers % bigCountKilos !=0 && bigCountKilos - (bigCountCapacity % goal) > smallCount){
                    return false;
                }
                bigBagsLeft--;
            }
            System.out.println(leftovers);
        }
        leftovers = Math.abs(leftovers);

        if (smallCount == 0 && leftovers > 0){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(5, 3, 24));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));
    }

}
