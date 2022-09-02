package academy.learnProgramming.controlFlow;

public class Switch {

    public static void main(String[] args) {
        int switchValue = 2;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Other value");
        }

        char charSwitch = 'a';
        switch (charSwitch) {
            case 'a':
                System.out.println("Char a");
                break;
            case 'b':
                System.out.println("Char b");
                break;
            case 'c':
                System.out.println("Char c");
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.println("Char d, e, f");
                break;
            default:
                System.out.println("Could not found a, b, c, d, e");
                break;
        }
        String month = "jaNuary";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(-1);

    }

   public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
   }
}
