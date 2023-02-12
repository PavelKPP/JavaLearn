package Task1;
import java.util.Scanner;



public class Rectangle {
    static double side1;
    static double side2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put length of first side and length of second:");
        side1 = sc.nextDouble();
        side2 = sc.nextDouble();
        areaCalculator(side1, side2);
        perimeterCalculator(side1,side2);

    }

     static void areaCalculator(double side1, double side2) {
        double areaResult;
        areaResult = side1 * side2;
         System.out.println("Area of your Rectangle:" + areaResult);

    }

    static void perimeterCalculator(double side1, double side2){
        double perimeterResult;
        perimeterResult = (side1 * 2) + (side2 * 2);
        System.out.println("Perimeter of your rectangle:" + perimeterResult);

    }
}
