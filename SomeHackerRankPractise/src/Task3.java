//HackerRank InterviewPrep PlusMinus

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        double counterForPlus = 0;
        double counterForMinus = 0;
        double counterForZero = 0;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counterForPlus++;
            }
            if (array[i] < 0) {
                counterForMinus++;
            } else if (array[i] == 0) {
                counterForZero++;
            }
        }

        counterForPlus = counterForPlus / size;
        counterForMinus = counterForMinus / size;
        counterForZero = counterForZero / size;

        System.out.println(counterForPlus);
        System.out.println(counterForMinus);
        System.out.println(counterForZero);


    }
}
