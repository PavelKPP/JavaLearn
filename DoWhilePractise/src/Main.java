import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        while ( a < b){
            sum += a; // sum = sum + a
            a++;
             if(a == b)
            System.out.println(sum + b);*/

      /*  int a;
        int b;
        int quantity = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        while (a <= b){
            if(a % 3 == 0 && a % 5 != 0){
                quantity++;
        }
            a++;

    }System.out.println(quantity);*/

 /*       double a;
        double b = 0;
        double counter = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();

        while ( a > 0){
            counter += a;
            a--;
            b++;
        }

        System.out.println(counter / b);*/

   /*    int a;
        int max = 0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        while(a > 0){
            a = sc.nextInt();
            if (a > max){
                max = a;
            }
        }System.out.println(max);*/

        /*int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        while (a < b){
            a++;
            if( a % 2 == 0){
                System.out.println(a);
            }else
                continue;
        }*/


        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;

        while (num % i != 0) {
            i++;
        }
        System.out.println(i);*/


       /* Scanner sc = new Scanner(System.in);

        int a = 0;
        int b;
        b = sc.nextInt();
        int res = 0;

        while (a < b){
            a++;
            res += Math.pow(a, 2);

        }System.out.println(res);*/

        /*Scanner sc = new Scanner(System.in);

        double a;
        double b;

        int day = 1;

        a = sc.nextInt();
        b = sc.nextInt();

        while (a < b){
            a += a * 0.1;
            day++;

        }System.out.println(day);*/

        /*Scanner sc = new Scanner(System.in);
        int summary = 0;
        int n;
        n = sc.nextInt();

        while (n != 0){
        summary += (n % 10);
        n /= 10;
        }System.out.println(summary);*/


        /* Scanner sc = new Scanner(System.in);
        int a;
        int b = 0;

        int counter = 0;

        a = sc.nextInt();

        while (a != 0){
            a = sc.nextInt();
            if ( a > b ) {
                b = a;
                counter++;
                continue;
            }
            System.out.println(counter);*/

       /* Scanner sc = new Scanner(System.in);

        int number;
        int max_number = 0;

        number = sc.nextInt();


        while (number != 0){
           number = sc.nextInt();
           if ( number > max_number){
               max_number = number;
           }

        }System.out.println(max_number); */

        /*Scanner sc = new Scanner(System.in);

        int a;

        int beginner = 0;

        a = sc.nextInt();

        while ( beginner < a){
            beginner++;
            System.out.println(beginner);
        }*/

       /* Scanner sc = new Scanner(System.in);

        int a;
        int b;

        a = sc.nextInt();
        b = sc.nextInt();

        while (a <= b) {
            System.out.println(a);
            a++;
            }
        }*/


        /* Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        if (b>0)while(a<=b){ System.out.println(a); a++;}
        else
            while (a>=b){System.out.println(a);a--;}*/



        /*Scanner sc = new Scanner(System.in);

        int a;
        int sum = 0;

        a = sc.nextInt();

        while(a != 0){
            a = sc.nextInt();
            sum += a;
        }System.out.println(sum);*/

        /*Scanner sc = new Scanner(System.in);

        int a;
        int counter = 0;

        a = sc.nextInt();

        while (a > 0){
            a = sc.nextInt();
            if (a % 2 == 0){
                counter++;
            }
        }System.out.println(counter++);*/

        /*Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int summary = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = a; i <= b; i++){

            summary += i;
        }
        System.out.println(summary);*/

        /*Scanner sc = new Scanner(System.in);

        int delitel = 0;

        for(int a = sc.nextInt(); true; a = sc.nextInt()){
            if (a % 10 == 7){
                delitel += a;
            }
            if (a % 7 == 0){

                break;
            }
        }            System.out.println(delitel);*/

        Scanner sc = new Scanner(System.in);

        String cube = "Cube";
        String stop = "Stop";

        for (; true ; ){
            String s = sc.next();
            if (s.equals(stop)){
                break;
            }
            if (s.equals(cube)){
                continue;

            }else
                System.out.println("NO");
        }System.out.println("YES");





    }

}