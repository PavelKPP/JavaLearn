import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int counter = 0;

        str = sc.nextLine();

        String[] words = str.split("[ ,.!?']");
        for(String word : words){
            counter++;
            System.out.println(counter);
            System.out.println(word);
        }
    }
}
