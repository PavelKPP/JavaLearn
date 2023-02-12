import org.w3c.dom.css.Counter;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 1001;
        int [] Cube = new int[n];
        for (int number = 0; number < n; number++) {
            Cube[number] = number * number * number;
        }

        for (int i = 0; i < n; i++){
        }
        System.out.println(Cube[a]);
        System.out.println(Cube [b]);*/



        /*(Scanner sc = new Scanner(System.in);

        int multiplyier = 0;
         int n =sc.nextInt();
         int[] array = new int[n];
         for (int i = 0; i < array.length; i++) {
             array[i] = sc.nextInt();
         }
         multiplyier = sc.nextInt();
            for (int i = 0; i < array.length; i++){
                array[i] *= multiplyier;
            }

         for (int i = 0; i < n; i++) {
             System.out.print(array[i] + /n);
         }*/

    /*    Random rand = new Random();
    int [] array = new int[10];

    for(int i = 0; i < 10; i++){
        array[i] = rand.nextInt(50);
    }

    for(int i = 0; i < 10; i++ ){
        System.out.println(array[i]);
    }*/

/*        Scanner sc = new Scanner(System.in);

        int result = 0;
        int MasSize;
        int  Devider = 2;
        MasSize = sc.nextInt();

        int[] array = new int[MasSize];

            for(int i = 0; i < MasSize; i++) {
                array[i] = sc.nextInt();
                if(array[i] % Devider != 0){
                 int n = array[i];
                 result += n;

                }

            }
            System.out.println(result);


            for (int i = 0; i < MasSize; i++){
                if(i % 2 == 0) {
                    System.out.println(array[i]);
                }
            }*/

       /* Scanner sc = new Scanner(System.in);
        int MasSize = sc.nextInt();

        int array[] = new int[MasSize];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int nov = array[a];
        array[a] = array[b];
        array[b] = nov;

        for(int i = 0; i < MasSize; i++){
            System.out.println(array[i]);
        }*/

        /*Scanner sc = new Scanner(System.in);

        int MasSize = sc.nextInt();
        int counter = 1;
        int personHeight;
        int array[] = new int[MasSize];

        for(int i = 0; i < MasSize; i++){
            array[i] = sc.nextInt();
            }

        personHeight = sc.nextInt();

        for(int i = 0; i < MasSize; i++){
            if(array[i] > personHeight){
                counter++;
            }
        }
        for(int i = 0; i < MasSize; i++){
            if(array[i] == personHeight){
                counter += 1;
            }
        }
        System.out.println(counter);*/


        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int u = 0; u < arr.length; u++) {
                if(arr[i] == arr[u] && i != u){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i]);
            }
            flag = true;*/



        /*Scanner sc = new Scanner(System.in);
        int MasSize;
        MasSize = sc.nextInt();
        int array[] = new int [MasSize];
            for(int i = 0; i < MasSize; i++)
                array[i] = sc.nextInt();

            for(int i = 0; i < MasSize; i++){
                int tretiy;
                for(int j = 0; j < MasSize; j++){
                    tretiy = array[i];
                    array[j] = array[i];
                    array[i] = tretiy;
                }
                System.out.println(array[i]);

            }*/

        /*Scanner sc = new Scanner(System.in);
        int MasSize;
        MasSize = sc.nextInt();
            double array1[] = new double[MasSize];
                for(int i = 0; i < MasSize; i++){
                    array1[i] = sc.nextDouble();
                }
            double  array2[] = new double[MasSize];
                for(int i = 0; i < MasSize; i++){
                    array2[i] = sc.nextDouble();
                }

                for(int i = 0; i < MasSize; i++){
                    array1[i] += array2[i];
                    System.out.println(array1[i]);
                }*/

            /*Scanner sc = new Scanner(System.in);
            int MasHeight;
            int MasWidth;
                MasHeight = sc.nextInt();
                MasWidth = sc.nextInt();
            int array[][] = new int[MasHeight][MasWidth];
                for(int i = 0; i < MasHeight; i++)
                    for(int j = 0; j < MasWidth; j++)
                        array[MasHeight][MasWidth] = MasHeight * MasWidth + i;


                for(int i = 0; i < MasHeight; i++)
                    for(int j = 0; j < MasWidth; i++)
                        System.out.print(array[MasHeight][MasWidth] + "");
                        System.out.println();*/










    }
}


