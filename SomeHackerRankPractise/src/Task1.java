import java.util.Scanner;
//HackerRank Number Lines Jumps;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startPosOfFirts;
        int lengthOfJump1;
        int startPosOfSecond;
        int lengthOfJump2;

        startPosOfFirts = sc.nextInt();
        lengthOfJump1 = sc.nextInt();
        startPosOfSecond = sc.nextInt();
        lengthOfJump2 = sc.nextInt();

        for(int i = 0; i < 1000; i++){
            if(startPosOfFirts == startPosOfSecond){
                System.out.println("Yes");
            }
            startPosOfFirts += lengthOfJump1;
            startPosOfSecond += lengthOfJump2;
        }

        //System.out.println("No");
    }
}
