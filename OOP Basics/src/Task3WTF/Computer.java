package Task3WTF;

import java.util.Scanner;

public class Computer {

    private String name;

    public Computer(String name){
        this.name = name;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Computer[] computers = new Computer[5];
        for(int i = 0; i <= 5; i++){
            computers[i] = sc.nextLine();
        }
        for(int i = 0; i <= 5; i++){
            System.out.println(computers[i]);
        }

    }
}
