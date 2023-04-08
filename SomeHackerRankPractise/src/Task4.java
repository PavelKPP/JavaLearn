////HackerRank InterviewPrep MiniMaxSum

import java.math.BigInteger;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long max = 0;
        long mini = 0;


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }


        Arrays.sort(array);

        for (int i = 1; i < array.length; i++) {
            max += array[i];
        }

        for (int i = 0; i < array.length - 1; i++) {
            mini += array[i];
        }
        System.out.println(mini);
        System.out.println(max);

    }

}
