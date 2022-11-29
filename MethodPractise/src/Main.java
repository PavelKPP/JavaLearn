import java.util.Scanner;

public class Main {
    /*static double add(double a, double b){
        return a + b;
    }
    static double sub(double a, double b){
        return a - b;
    }
    static  double mul(double a, double b){
        return a * b;
    }
    static double div(double a, double b){
        return a / b;
    }*/

    /* static double dollar(double a, double b){

        return a / b;

    }*/

    /*static double primeNumber(double a){
        if (a > 0){
            System.out.println("Your count is positive");
            return a;
        }else{
            System.out.println("Your count is negative");
            return a;
        }

    }*/

    static double divide(double a){
        if ( a % 2 == 0 || a % 5 == 0 || a % 3 == 0 || a % 6 == 0 || a % 9 == 0){
            System.out.println("Your counter id devidable");
            return a;
        }else{
            System.out.println("Your counter is undevidable");
            return a;
        }
    }



    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        System.out.println("Put your first number: ");
        String firstNumber = sc.next();
        int a = Integer.parseInt(firstNumber);

        System.out.println("Put your second number: ");
        String secondNumber = sc.next();
        int b = Integer.parseInt(secondNumber);

        System.out.println("Put 1 of 4 signs: + / - / : / *  - ");
        String sign = sc.next();

        switch(sign){

            case "+":
                double add = add(a, b);
                System.out.println(add);
                break;
            case "-":
                double sub = sub(a, b);
                System.out.println(sub);
                break;
            case "*":
                double mul = mul(a, b);
                System.out.println(mul);
                break;
            case ":":
                double div = div(a, b);
                System.out.println(div);

                break;
        }*/

       /* Scanner sc = new Scanner(System.in);

        double b;

        System.out.println("Put your vallue in Hryvna: ");
        String value = sc.next();
        int a = Integer.parseInt(value);

        System.out.println("Choose your currency:'Euro', Dollar, CAD");
        String currency = sc.next();

        switch (currency){
            case "Euro":
                b = 38.24;
                double euro = dollar(a, b);
                System.out.println(euro);
                break;
            case "Dollar":
                b = 36.97;
                double dollar = dollar(a, b);
                System.out.println(dollar);
                break;
            case "CAD":
                b = 27.40;
                double CAD = dollar(a, b);
                System.out.println(CAD);
                break;

        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Put your number for verifying of prime: ");
        String number = sc.next();
        int a = Integer.parseInt(number);
        double VerifOperation = primeNumber(a);
        System.out.println(VerifOperation);*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Put your number for verifing: ");
        String number = sc.next();
        int a = Integer.parseInt(number);
        double DevidingVerif = divide(a);
        System.out.println(DevidingVerif);



            }
    }
