package Task2;

import Task1.Zoo;

import java.util.ArrayList;

public class Zoo2  {

    public static void main(String[] args) {
        ArrayList animals2 = new ArrayList<>();
        animals2.add(0, "Dog");
        animals2.add(1, "Cat");
        animals2.add(2, "Snake");
        animals2.add(3, "Cow");
        animals2.add(4, "Elephant");
        animals2.add(5, "Deer");
        animals2.add(6, "Bear");
        animals2.add(7, "Mouse");

        System.out.println(animals2.toString());


        animals2.remove("Snake");
        animals2.remove("Elephant");
        animals2.remove("Bear");

        System.out.println(animals2.size());

    }
}
