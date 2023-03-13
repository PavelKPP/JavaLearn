package Task1;

import java.lang.reflect.Member;

public class Task1 {
    public static void main(String[] args) {
        try{
            //Getting an object of class type.
            Class<?> c = Class.forName(args[0]);
            System.out.println(c);
            //Calling all fields
            printMembers(c.getFields());
            //Calling all constructors.
            printMembers(c.getConstructors());
            //Calling all Methods.
            printMembers(c.getMethods());


        } catch (ClassNotFoundException ex){
            System.out.println("Неизвестный класс");
        }
    }


    private static void printMembers (Member[] mems){
        //Running threw length of Interface Member.
        for(int i = 0; i < mems.length; i++){
            if(mems[i].getDeclaringClass() == Object.class){
                continue;
            }
            String decl = mems[i].toString();
            System.out.println("  ");
            System.out.println(decl);
        }
    }
}
