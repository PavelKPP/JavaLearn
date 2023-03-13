package Task2;

import java.util.*;


public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, String> cityFamily = new HashMap<>();

        cityFamily.put("Kyiv", "Kuzhel");
        cityFamily.put("Ljubljana", "Rogoza");
        cityFamily.put("London", "Abramovich");
        cityFamily.put("Vilnius", "Varakas");
        cityFamily.put("Montreal", "Pare");
        cityFamily.put("Ottawa", "Sych");

        System.out.println(cityFamily);
        System.out.println("ReplacementMethod:");
        replacement(cityFamily);

        System.out.println(cityFamily);
        System.out.println("Delete Method");
        delete(cityFamily);

        System.out.println(cityFamily);

        System.out.println("Adding method");
        add(cityFamily);
        System.out.println(cityFamily);
    }

    public static void replacement(HashMap<String, String> hashMap) {
        String inputforreplace;
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the name of the City");
        inputforreplace = sc.next();
        System.out.println(hashMap.get(inputforreplace));
        Set set = hashMap.entrySet();
        for(Object o : set){
            Map.Entry m = ((Map.Entry)o);
            if(m.getKey().equals(inputforreplace)){
                System.out.println("Put a new familly:");
                String newValue;
                newValue = sc.next();
                m.setValue(newValue);
            }
        }
    }

    public static void delete(HashMap<String, String> HashMap){
        String inputForDelete;
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the name of the city to delete");
        inputForDelete = sc.next();
        HashMap.remove(inputForDelete);

    }


    public static void add(HashMap<String, String> hashMap){
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the name of the city and name of the familly:");
        String city = sc.next();
        String name = sc.next();

        hashMap.put(city, name);
    }
}



