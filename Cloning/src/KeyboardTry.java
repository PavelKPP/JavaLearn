import java.util.Scanner;

public class KeyboardTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(plus(a, b));

    }

    private static int plus(int a, int b){
        int result = 0;
        result = a + b;
        return result;
    }
}
