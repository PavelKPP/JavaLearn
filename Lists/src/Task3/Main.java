package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 10; i++){
            int max_value  = 1000;
            int random = rand.nextInt(max_value);
            list.add(random);
        }
        System.out.println(list);




        Iterator<Integer> iterator = list.iterator();


        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer + 1);

        }


    }
}
