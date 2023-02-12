package AdditionalTask;

import java.util.Scanner;

public class Calculator {

    static double add(double a, double b){
        return a + b;

    }

    static double sub(double a, double b){
        return a - b;

    }

    static double mul(double a, double b){
        return a*b;

    }

    static double div(double a, double b){
        try{
            if ( a == 0 || b == 0){
                throw new Exception("Error dividing by 0");
            }
        }catch (Exception e){

            System.out.println("Exception... Dividing by 0");
            System.out.println("But, result: ");
            return 0;
        }
        return a / b;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ArithmeticalMeth;

        System.out.println("Choose one of four Arithmetical Methods: +, -, *, /.");
        ArithmeticalMeth = sc.next();

        System.out.println("Put your numbers in here: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch(ArithmeticalMeth){
            case "+":
                System.out.println(add(a, b));
                break;
            case "-":
                System.out.println(sub(a, b));
                break;
            case "*":
                System.out.println(mul(a, b));
                break;
            case "/":
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("There is no method like this...");

        }
    }
}
