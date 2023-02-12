package Task2;

import java.util.ArrayList;
import java.util.Scanner;


public class MyDictionary <Tkey, Tvalue>{
    ArrayList<Tkey> keyList = new ArrayList<>();
    ArrayList<Tvalue> valueList = new ArrayList<>();

    MyDictionary(){

    }
    MyDictionary(ArrayList<Tkey> keyList, ArrayList<Tvalue> valueList){
        this.keyList = keyList;
        this.valueList = valueList;
    }

    void adder(Tkey key, Tvalue value){
        keyList.add(key);
        valueList.add(value);

    }

    void finder(int keyIndex, int valueIndex){
        System.out.println(keyList.get(keyIndex));
        System.out.println(valueList.get(valueIndex));
    }

    void lengthChecker(){
        System.out.println(keyList);
        System.out.println(valueList);
        System.out.println("KeyList: " + keyList.size());
        System.out.println("ArrayList: " + valueList.size());


    }






}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyDictionary myDictionary = new MyDictionary();

        int keyFiller;
        String valueFiller;

        int keyIndex, valueIndex;


        System.out.println("Fill the list for 5 keys and values in order one by one:");
        for(int i = 0; i < 5; i++){
            keyFiller = sc.nextInt();
            valueFiller = sc.next();
            myDictionary.adder(keyFiller, valueFiller);
        }


        System.out.println("Result of adding method");

        System.out.println("Put the index of the key and index of the valeu to know which key is it:");
        keyIndex = sc.nextInt();
        valueIndex = sc.nextInt();
        myDictionary.finder(keyIndex, valueIndex);

        myDictionary.lengthChecker();

    }
}
