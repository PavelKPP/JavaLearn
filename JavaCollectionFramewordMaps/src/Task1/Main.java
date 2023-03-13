package Task1;

import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    enum City{
      KYIV, LJUBLJANA, LONDON, VILNIUS, MONTREAL, OTTAWA
    }

    public static void main(String[] args) {

        Map<City, String> enumMap = new EnumMap<City, String>(City.class);

        enumMap.put(City.KYIV, "Kuzhel");
        enumMap.put(City.LJUBLJANA, "Rogoza");
        enumMap.put(City.LONDON, "Abramovich");
        enumMap.put(City.VILNIUS, "Varakas");
        enumMap.put(City.MONTREAL, "Pare");
        enumMap.put(City.OTTAWA, "Sych");

        Scanner sc = new Scanner(System.in);

        String cityInput;

        System.out.println("To get the family name, print one of this city: ");
        System.out.println("Kyiv");
        System.out.println("Ljubljana");
        System.out.println("London");
        System.out.println("Vilnius");
        System.out.println("Montreal");
        System.out.println("Ottawa");

        cityInput = sc.next();

        switch (cityInput){
            case "Kyiv":
                System.out.println(enumMap.get(City.KYIV));
                break;
            case "Ljubljana":
                System.out.println(enumMap.get(City.LJUBLJANA));
                break;
            case "London":
                System.out.println(enumMap.get(City.LONDON));
                break;
            case "Vilnius":
                System.out.println(enumMap.get(City.VILNIUS));
                break;
            case "Montreal":
                System.out.println(enumMap.get(City.MONTREAL));
                break;
            case "Ottawa":
                System.out.println(enumMap.get(City.OTTAWA));
                break;
        }



    }


}