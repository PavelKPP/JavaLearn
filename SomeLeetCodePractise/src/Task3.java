import java.util.Scanner;

public class Task3 {
    //Java Strings Compare // HackerRank.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;

        int size;

        line = sc.next();
        size = sc.nextInt();

        for(int j = 0; j < line.length(); j++){
            if((j >= line.length() - size)){
                System.out.print(line.charAt(j));
            }
        }

        System.out.println("");


        for(int i = 0; i < line.length(); i++){
            if(i < size){
                System.out.print(line.charAt(i));
            }
        }
    }
}
