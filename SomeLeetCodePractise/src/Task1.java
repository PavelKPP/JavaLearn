import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
//Java Substring // HackerRank
public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str;

        int start;
        int end;

        str = sc.next();
        start = sc.nextInt();
        end = sc.nextInt();

        for(int i = 0; i < str.length(); i++){
            if(i >= start && i < end){
                System.out.print(str.charAt(i));
            }
        }
    }
}




