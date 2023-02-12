package AdditionalTask;

import java.util.ArrayList;

public class Main {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {


        list.add("Tatiana");
        list.add("Natalia");
        list.add("Oksana");
        list.add("Maria");
        list.add("Inna");
        list.add("Karina");

        System.out.println(list);

        String worstTeacher = "Oksana";
        String bestTeacher = "Tatiana";



        System.out.println("The worst teacher is:");
        System.out.println(list.indexOf(worstTeacher));

        System.out.println("The best teacher is: ");
        System.out.println(list.indexOf(bestTeacher));

    }

}
