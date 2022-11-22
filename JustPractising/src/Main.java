import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


   /*     int a = 3;
        int b = 8;
        int result = 0;

        while (a < b){
            result += a;
            a++;
            System.out.println("Answer: " + result);
        }*/

        /*int a = 3;
        int b = 8;

        while (a < b){
            a++;
            if (a % 2 == 0) {
                a++;
                continue;
            }
            else
                System.out.println(a);                */
        /*for(int i = 0; i < 5; i++){

            for(int j = 0; j < 20; j++){
                System.out.print("*");
            }

            System.out.println();*/

        int rectangle = 5;

        for (int i = 0; i < rectangle; i++){

            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }


            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("+");
            }


            for (int j = 0; j < i; j++){
                System.out.print("+");
            }


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);
        }
        for (int i = rectangle; i >= 0; i--){


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

//
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("+");
            }


            for (int j = 0; j < i; j++){
                System.out.print("+");
            }


            for (int j = rectangle; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("*"+i);



        /*int a = 5;
        int factorial = 1;

        do{
            factorial *= a--;
        }while (a > 0);

        System.out.println(factorial);*/

        }
    }
}