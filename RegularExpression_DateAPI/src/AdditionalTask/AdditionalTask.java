package AdditionalTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionalTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Put your login: ");

        int counter = 0;
        for(int i = 0; i < 3; i++){
            String login;
            login = sc.next();

            Pattern LoginPattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher LoginMatcher = LoginPattern.matcher(login);

            boolean l = LoginMatcher.matches();
            if(l){
                System.out.println("Great Work! Put your password: ");
                String password;
                password = sc.next();

                Pattern PasswordPattern = Pattern.compile("^([0-9]|[\\-+#!.&*])+$");
                Matcher PasswordMatcher = PasswordPattern.matcher(password);

                boolean p = PasswordMatcher.matches();

                if(p){
                    System.out.println("Great job!");
                    System.exit(1);
                }
            }else{
                counter++;
                System.out.println("You have " + counter + "/3 attemps more");
            }
        }


    }
}
