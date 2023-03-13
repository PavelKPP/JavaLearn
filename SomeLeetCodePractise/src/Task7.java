import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String IP;

        IP = sc.nextLine();

    //

        System.out.println(new MyRegex().pattern(IP));

    }
}

class MyRegex{
    String IP;

    final String IPV4_PATTERN_ALLOW_LEADING_ZERO =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public boolean pattern(String IP){
        return IP.matches(IPV4_PATTERN_ALLOW_LEADING_ZERO);
    }
}
