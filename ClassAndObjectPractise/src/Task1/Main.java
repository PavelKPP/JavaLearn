package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car(2003, "Green");
        //Suot for class without Parameters.
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the year of your Car:");
        car.year = sc.nextInt();
        System.out.println("Year that you put: " + car.year);
        System.out.println("Put the color of your Car:");
        car.Color = sc.next();
        System.out.println("Color that you put: " + car.Color);
        //Sout for class with parameters;
        System.out.println("Basic color and year:");
        System.out.println("Color: " + car2.Color);
        System.out.println("Year: " + car2.year);

    }
}
