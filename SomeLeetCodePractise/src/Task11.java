import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        size = sc.nextInt();

        int columns = 3;
        int rows = 3;
        int sumOfFirst = 0;
        int sumOfSecond = 0;
        int result = 0;

        int[][] array = new int[size][size];
        array[0][0] = 11;
        array[0][1] = 2;
        array[0][2] = 4;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 10;
        array[2][1] = 8;
        array[2][2] = -12;
        System.out.println("The 2D array:");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonals of the 2D Array:");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == j){
                    sumOfFirst += array[i][j];
                }
                if(i == size - j - 1){
                    sumOfSecond += array[i][j];
                }

            }
        }
        result = Math.abs(sumOfFirst - sumOfSecond);

        System.out.println(result);
    }
}
