import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        int counterForPositive = 0;
        int counterForZero = 0;
        int counterForNegative = 0;

        double resForPositive = 0.0;
        double resForZero = 0.0;
        double resForNegative = 0.0;


        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
            if(array[i] > 0){
                counterForPositive++;
            }
            if(array[i] == 0){
                counterForZero++;
            }
            if(array[i] < 0){
                counterForNegative++;
            }
        }
        resForPositive = (double)counterForPositive / size;
        resForZero = (double)counterForZero / size;
        resForNegative = (double) counterForNegative/ size;

        System.out.println(resForPositive);
        System.out.println(resForZero);
        System.out.println(resForNegative);

    }
}
