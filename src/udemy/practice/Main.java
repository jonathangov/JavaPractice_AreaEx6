package udemy.practice;

public class Main {

    public static void main(String[] args) {
        area(5);
        System.out.println(area(20));
        System.out.println(area(10, 5));
        System.out.println(area(-10, 5));
    }

    public static double area(double radius) {
        if(radius >= 0) {
            double result = radius * radius * Math.PI;
            return result;
        } else {
            return -1;
        }
    }

    public static double area(double x, double y) {
        if( x >= 0 && y >= 0) {
            double result = x * y;
            return result;
        } else {
            return -1;
        }
    }
}
