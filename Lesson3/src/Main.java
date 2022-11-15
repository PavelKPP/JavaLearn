import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* int x = 10;
        int y = 12;
        int z = 3;
        int result1 = (x += y - x++ * z);
        int result2 = (z = --x - y * 5);
        int result3 = (y /= x + 5 % z);
        int result4 = (z = x++ + y * 5);
        int result5 = (x = y - x++ * z);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5); */

        /*
        Scanner Scanner = new Scanner(System.in);
            System.out.println("x = ");
        int FirstNumber = Scanner.nextInt();
            System.out.println("y = ");
        int SecondNumber = Scanner.nextInt();
            System.out.println("z = ");
        int ThirdNumber = Scanner.nextInt();

        int res = (FirstNumber + SecondNumber + ThirdNumber) /3;

        System.out.println(res);
        */

        /*double Pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("r = ");
        int r = sc.nextInt();

        double res = (Pi * Math.pow(r, 2));

        System.out.println(res);*/


        /*
        double Pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Put your raiduis = ");
        int Rad = sc.nextInt();
        System.out.println("Put your height = ");
        int Height = sc.nextInt();

        double Volume = (Pi * Math.pow(Rad, 2) * Height);
        double Square = (2 * Pi * Rad * (Rad + Height));

        System.out.println(Volume);
        System.out.println(Square); */

/*
       int  _Identifier;
       int myVariab1le;
*/
        /*int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Put your number");
        num = sc.nextInt();
            if (num >= 0 && num <= 14){
                System.out.println("Your number in [0-14] range");
            }if (num >= 15 && num <= 35){
                System.out.println("Your number in [15-35] range");
            }if (num >= 36 && num <= 50){
                System.out.println("Your Number in [36-50] range");
            }if (num >= 50 && num <=100){
                System.out.println("Your number in [50-100]");
            }if (num >= 100) {
                System.out.println(num);
        }*/

       /* int month = 4;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
*/
        int operand1;
        int operand2;
        int plus, minus,division, multiply;
        operand1 = 36;
        operand2 = 6;
        plus = operand1 + operand2;
        minus = operand1 - operand2;
        division = operand1 / operand2;
        multiply = operand1 * operand2;

        System.out.println("Put your sign : 1 - +; 2 - -; 3 - /; 4 - *;");


        int sign;
        Scanner sc = new Scanner(System.in);
        sign = sc.nextInt();
        switch (sign){
            case 1:
                System.out.println(plus);
                break;
            case 2:
                System.out.println(minus);
                break;
            case 3:
                System.out.println(division);
                break;
            case 4:
                System.out.println(multiply);
                break;
        }



    }


}