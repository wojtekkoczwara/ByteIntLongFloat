package academy.learnProgramming.codingExercise;

public class Exercise2MegabytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes/1024) + " MB and " + kiloBytes % 1024 + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

}
