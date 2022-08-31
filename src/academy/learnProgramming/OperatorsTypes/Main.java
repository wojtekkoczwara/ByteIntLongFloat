package academy.learnProgramming.OperatorsTypes;

public class Main {



    public static void main(String[] args) {
        int myValue = 10000;
        int myValue2 = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myValue2);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println(" Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println(" Busted MAX value = " + (myMaxIntValue + 10));
        System.out.println(" Busted MIN value = " + (myValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(" Byte Minimum value = " + myMinByteValue);
        System.out.println(" Byte Maximum value = " + myMaxByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println(" Short Minimum value = " + myMaxShortValue);
        System.out.println(" Short Maximum value = " + myMaxShortValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println(" Long Minimum value = " + myMaxLongValue);
        System.out.println(" Long Maximum value = " + myMaxLongValue);
        long longVal = 214748364777L + myValue;
        System.out.println(longVal);


        short bigShortLiteralValue = 32767;

        int myTotal =(myValue2 / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        //domyślnie po wykonaniu działania (i wszystkiego innego) java traktuje każdą iczbę jako int. Dlatego trzeba dokładnie powiedzieć, że wynikiem działania matematycznego będzie inny typ - nazywa się to castem

        //-------Prymitive types challenge

        byte byteChallenge = 10;
        short shortChallenge = 1000;
        int intChallenge = 1023453888;
        long longChallenge = 50000L + 10L*(byteChallenge + shortChallenge + intChallenge);
        System.out.println(longChallenge);
    }


}
