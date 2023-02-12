package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyList<T> {
    ArrayList<T> list = new ArrayList<>();



    public void adder(String addValue){
        list.add((T) addValue);
    }




    public void finder(int index){
        System.out.println(list.get(index));
    }

    public void lengthChecker(){
        for (T temp : list){
            System.out.println(temp);
        }
        System.out.println(list.size());
    }






}


class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String listFiller;

        int yourIndex;



        MyList<String> myList = new MyList<String>();

        System.out.println("Fill the list with your words(5 words:)");

        for(int i = 0; i < 5; i++){
                listFiller = sc.next();
                myList.adder(listFiller);
            }
        System.out.println("Result of adding method");

        System.out.println("Put your index to find word: (Index have to be smaller than 4");
        yourIndex = sc.nextInt();
        myList.finder(yourIndex);

        System.out.println("Last task, you will see all words putted by you and lenght of list: ");
        myList.lengthChecker();



    }
}