package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static int counter = 0;
    static void doubleValues(List<String> list1){
        for(int i = 0; i < 5; i++){
            String adder = list1.get(counter);
            list1.add(counter + 1, list1.get(counter));
            counter = counter + 2;
        }
    }
    public static void main(String[] args) throws IOException {

        List<String> list = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;

        System.out.println("Put 5 words into your list:");

        for(int i = 0; i < 5; i++){
            s = reader.readLine();
            list.add(s);
        }
        System.out.println(list);

        doubleValues(list);

        System.out.println(list);

    }
}
