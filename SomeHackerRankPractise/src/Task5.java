import java.util.Scanner;
//MockTest.Test
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            if(i % 3 == 0 && i % 5 != 0)
                System.out.println("Fizz");
            if(i % 5 == 0 && i % 3 != 0)
                System.out.println("Buzz");
            if(i % 5 != 0 && i % 3 != 0)
                System.out.println(i);
        }
    }
}
