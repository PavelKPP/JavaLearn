package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Worker worker = new Worker();

        final int YEAROFCOMPANYSTART = 2010;

        System.out.println("Put data about yourself: Name, Second Name, Position, Year");
        worker.name = sc.next();
        worker.secondName = sc.next();
        worker.position = sc.next();
        worker.year = sc.nextInt();

        try{
            if(worker.year <= YEAROFCOMPANYSTART){
                throw new Exception("Year Exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Year must be smaller than yours!!!");
        }

        int exprience;
        exprience = 2023 - worker.year;

        Worker[] arr =
                {new Worker(worker.name, worker.secondName, worker.position, worker.year)};
        Arrays.sort(arr);

        System.out.println("Name of the worker: " + worker.name);
        System.out.println("Experince: " + exprience);

    }


}

