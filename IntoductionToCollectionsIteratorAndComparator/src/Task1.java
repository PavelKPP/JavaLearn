import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> task1list = new ArrayList<>();

        task1list.add("Pavlo");
        task1list.add("Ilya");
        task1list.add("Dmitriy");
        task1list.add("Vladislav");
        task1list.add("Artem");
        task1list.add("Sergey");
        task1list.add("Olexandr");
        task1list.add("Dmitriy");
        task1list.add("Artur");
        task1list.add("Maksym");

        ListIterator<String> listIterator = task1list.listIterator();

        while(listIterator.hasNext()){
            String tmp = listIterator.next();
            System.out.println(tmp);
        }

    }

}
