import java.util.Arrays;
import java.util.Scanner;
//HackerRank Grading Problem.
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        double dividible;
        int difference;

        int[] gradeArr = new int[size];
        for(int i = 0; i < gradeArr.length; i++){
            gradeArr[i] = sc.nextInt();
        }

        for(int i = 0; i < gradeArr.length; i++) {
            if (gradeArr[i] >= 37) {
                dividible = gradeArr[i] / 5;
                dividible = (dividible + 1) * 5;
                difference = (int) dividible - gradeArr[i];
                if (difference < 3) {
                    gradeArr[i] = (int) dividible;
                }
            }
        }

        System.out.println(Arrays.toString(gradeArr));


    }
}
