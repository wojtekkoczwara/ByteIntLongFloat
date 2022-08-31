package academy.learnProgramming.codingExercise;

public class Exercise4LeapYear {
    
    public  static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        } else if (year % 4 == 0){
            if (year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(1924));
    }
}
