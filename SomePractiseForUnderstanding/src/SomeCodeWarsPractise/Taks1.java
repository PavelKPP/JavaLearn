package SomeCodeWarsPractise;

import java.util.Scanner;

public class Taks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stiks;
        stiks = 21;

        int determinator;



        do{
            determinator = sc.nextInt();
            stiks = stiks - determinator;
            System.out.println(stiks);

        }while(stiks > 0);
    }
}
