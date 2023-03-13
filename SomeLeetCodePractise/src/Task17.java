import java.util.Scanner;
//Hacker Rank. Transfer to site.
public class Task17 {
    public static void main(String[] args) {
        int counterForPlus = 0;
        int counterforMinus = 0;
        int counterforZero = 0;

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                counterForPlus++;
            }
            if(array[i] < 0){
                counterforMinus++;
            }
            if (array[i] == 0){
                counterforZero++;
            }
        }
        double resForPlus = counterForPlus / (double)size;
        double resForMinus = counterforMinus / (double)size;
        double resForZero = counterforZero / (double) size;
        System.out.println(resForPlus);
        System.out.println(resForMinus);
        System.out.println(resForZero);

    }

}
