package AdditionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int radius;
       double result;
       System.out.println("Put length of your Radius in here: ");
       radius = sc.nextInt();
       result = 2 * MyArea.PI * radius;
       System.out.println("Radius of your circle: " + result);



    }
}
