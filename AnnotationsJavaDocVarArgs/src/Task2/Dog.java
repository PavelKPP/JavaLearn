package Task2;

import java.lang.annotation.*;
import java.lang.reflect.Method;

class Animal{
    @MyStringAnno(str = "I can fly")
    static void move(String str){
        System.out.println(str);
    }
}


public class Dog extends Animal {
    public static void main(String[] args) {
        try{
            Animal animal = new Animal();
            Class<?> cl = Animal.class;
            Method functional = cl.getDeclaredMethod("move", String.class);
            MyStringAnno myStringAnno = functional.getAnnotation(MyStringAnno.class);
            move(myStringAnno.str());
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }

    }
}
@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyStringAnno{
    String str() default "I can run";
}
