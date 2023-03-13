import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        int greatest = 0;
        int counter = 1;

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            if (arr[i] > greatest){
                greatest = arr[i];
            }else if(arr[i] == greatest){
                counter++;
            }
        }

        System.out.println(greatest);
        System.out.println(counter);
    }
}
