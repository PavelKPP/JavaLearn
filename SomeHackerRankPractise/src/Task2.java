import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();
        int replacer = 100;

        int pairsCounter = 0;

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    pairsCounter++;
                    array[i] = replacer;
                    replacer++;
                    array[j] = replacer;
                     j++;
                }
            }
        }

        List<Integer> ar = new ArrayList<>();



    }
}
