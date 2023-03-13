import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;

        String out;
        String hashTag = "#";
        out = hashTag;
        String Space = " ";
        String outSpace = "     ";
        size = sc.nextInt();

        for(int i = 0; i < size; i++){
            System.out.println(outSpace + out);
            out += hashTag;
        }


    }
}
