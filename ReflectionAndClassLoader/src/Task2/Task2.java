package Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Task2 {
    private static final class DogMethods{
        public String name = "Chaplin";
        private int age = 3;
        short friends = 2;
        protected long weight = 30;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public short getFriends() {
            return friends;
        }

        public void setFriends(short friends) {
            this.friends = friends;
        }

        public long getWeight() {
            return weight;
        }

        public void setWeight(long weight) {
            this.weight = weight;
        }

        DogMethods(){}

        DogMethods(int weight){
            this.weight = weight;
        }

        DogMethods(String name, int age, short friends, long weight){
            this.name = name;
            this.age = age;
            this.friends = friends;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        //Making some colors.
        String color = (char) 27 + "[31m";
        String color2 = (char) 27 + "[39m";
        String color3 = (char) 27 + "[34m";
        //Getting a class which describes class DogMethods.
        Class<?> cl = DogMethods.class;
        System.out.println(color + "Constructor's: " + color2);
        //Getting an array of Constructors.
        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        int i = 0;
        for(Constructor<?> ctr : constructors){
            //Printing types of parameters per each constructor:
            System.out.print(color + "\tConstructor" + (++i) + ": ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for(Class<?> paramType : paramTypes){
                System.out.print(color3 + paramType.getName() + " ");
            }
            System.out.println();
        }

        Method[] methods = cl.getMethods();
        for(Method method : methods){
            System.out.println(color + "Name: " + color2 + method.getName());
            System.out.println(color + "\t Return type: " + color2 + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(color + "\tParam type: " + color2);
                for(Class<?> paramType : paramTypes){
                    System.out.println(" " + paramType.getName());
                }
            System.out.println();
        }

    }
}
