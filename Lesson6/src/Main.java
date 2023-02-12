import java.util.Scanner;

public class Main {
    /*static int Bank(int payment){
        int Credit = 10000;
        if (payment > Credit){
            System.out.println("Congrats! Today you closed a credit!!!");
            return payment;
        }
        int Rest = 0;
        int UsualPayment = 500;
        int difference = 0;
            if (payment > UsualPayment){
                difference = payment - UsualPayment;
                Rest = Credit - payment;
                System.out.println("Rest of your credit: " + Rest + ". With last payment you over-payed: " + difference);
            }
            if (payment > Credit)
                System.out.println("Congrats! Today you closed a credit!!!");
        return Credit;*/

public static int recursion(int factorial){
    if (factorial == 0)
        return 1;
    else
        return factorial * recursion(factorial - 1);
}







    public static void main(String[] args) {
     /*   System.out.println("Put value of your payment: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int pPaymnet = Integer.parseInt(a);
        Bank(Integer.parseInt(a));*/



        System.out.println("Put number od waiting clients: ");
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int numberOfClients = Integer.parseInt(N);
        recursion(numberOfClients);

        System.out.println(recursion(numberOfClients));
    }
}