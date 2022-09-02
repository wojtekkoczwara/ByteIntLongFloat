package academy.learnProgramming.codingExercise;

public class Exercise13IsLeapYear {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        int days;
        if(year < 1 || year > 9999 || month < 1 || month > 12){
           days = -1;
        } else {
            if(isLeapYear(year)){
                switch (month){
                    case 1:
                        days = 31;
                        break;
                    case 2:
                        days = 29;
                        break;
                    case 3:
                        days = 31;
                        break;
                    case 4:
                        days = 30;
                        break;
                    case 5:
                        days = 31;
                        break;
                    case 6:
                        days = 30;
                        break;
                    case 7:
                        days = 31;
                        break;
                    case 8:
                        days = 31;
                        break;
                    case 9:
                        days = 30;
                        break;
                    case 10:
                        days = 31;
                        break;
                    case 11:
                        days = 30;
                        break;
                    case 12:
                        days = 31;
                        break;
                    default:
                        days = -1;
                }
            } else {
                switch (month) {
                    case 1:
                        days = 31;
                        break;
                    case 2:
                        days = 28;
                        break;
                    case 3:
                        days = 31;
                        break;
                    case 4:
                        days = 30;
                        break;
                    case 5:
                        days = 31;
                        break;
                    case 6:
                        days = 30;
                        break;
                    case 7:
                        days = 31;
                        break;
                    case 8:
                        days = 31;
                        break;
                    case 9:
                        days = 30;
                        break;
                    case 10:
                        days = 31;
                        break;
                    case 11:
                        days = 30;
                        break;
                    case 12:
                        days = 31;
                        break;
                    default:
                        days = -1;
                        break;
                }
            }
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(2, 1700));
        System.out.println(getDaysInMonth(2, 1600));
        System.out.println(getDaysInMonth(2, 1000000));
        System.out.println(getDaysInMonth(24, 2000));
    }
}
