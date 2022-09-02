package academy.learnProgramming.codingExercise;

public class Exercise8AreaCalculator {

    public static double area(double radius){
        double result = -1;
        if(radius >= 0){
            result = radius * radius * Math.PI;
        }
        return result;
    }

    public static double area(double x, double y){
        double result = -1;
        if(x >= 0 && y >= 0){
            result = x * y;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(2, 5));
    }

}
