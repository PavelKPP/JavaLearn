import java.math.BigInteger;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bigInteger;
        bigInteger = sc.nextInt();

        BigInteger bigInteger1 = new BigInteger(String.valueOf(bigInteger));


        if(bigInteger1.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
