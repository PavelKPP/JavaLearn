import java.util.*;
//MockTest
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);


        List<Integer> arr = new ArrayList<>();

        arr.sort(Comparator.naturalOrder());



    }
}
