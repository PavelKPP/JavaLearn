import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String am = "AM";
        String pm = "PM";

        int concerterforAm = 12;

        String s = "12:01:00AM";

        String result = "";

        if(s.contains(am)){
            for(int i = 0; i < 2; i++){
                result += s.charAt(i);
            }
        }

        concerterforAm +=  Integer.parseInt(result);
        String adder = "";
       adder = String.valueOf(concerterforAm);

        System.out.println(s.replace("12", adder));


        System.out.println(result);
    }
}
