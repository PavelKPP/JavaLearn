import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time;
        time = sc.next();

        String listTime[] = time.split(":");

        String hour = listTime[0];
        String min = listTime[1];
        String sec = listTime[2].substring(0,2);
        String caser = listTime[2].substring(2, 4);

        if(caser.equals("AM")){
            if(hour.equals("12"))
                hour = "00";

            System.out.println(hour + ":" + min + ":" + sec);
        }else{
            if(!hour.equals("12")){
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            System.out.println(hour + ":" + min + ":" + sec);

        }



    }
}