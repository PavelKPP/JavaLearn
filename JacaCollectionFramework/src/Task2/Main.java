package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void getIntegerList(List<Integer> listFilling){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
            int numberInput;
            numberInput = sc.nextInt();
            listFilling.add(numberInput);
        }
    }

     static int getMinimum(List<Integer> listGetMin){
         int Element = 0;
         Element = listGetMin.get(3);
        for(int i = 0; i < 8; i++){
            if(Element > listGetMin.get(i)){
                Element = listGetMin.get(i);
            }
        }
         System.out.println("Minimum value: " + Element);
        return Element;
    }

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        getIntegerList(list);

        System.out.println(list);

        getMinimum(list);

    }
}