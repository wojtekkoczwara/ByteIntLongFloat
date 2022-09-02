package academy.learnProgramming.controlFlow;

public class ParsingValuesFromAString {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println(numberAsString + "numberAsString = " + numberAsString);
        int number = Integer.parseInt(numberAsString);

        numberAsString += 1;
        number +=1;
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
