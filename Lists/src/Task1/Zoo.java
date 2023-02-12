package Task1;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList animals = new ArrayList();

        animals.add(0, "Dog");
        animals.add(1, "Cat");
        animals.add(2, "Snake");
        animals.add(3, "Cow");
        animals.add(4, "Elephant");
        animals.add(5, "Deer");
        animals.add(6, "Bear");
        animals.add(7, "Mouse");

        System.out.println(animals.toString());

    }
}
