package Task1;

import java.lang.annotation.Documented;

/**
 * @author Pavlo Kuzhel
 *
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Task1 {
    /**
     * This is a method to calculate the sum of two values.
     * @param value1 first value from annotation.
     * @param value2 second vaue from annotation.
     * @return This method returning the sum of value1 and value2.
     */
    @MyAnno(value1 = 5, value2 = 10)
    private int calcPlus(int value1, int value2){
        System.out.println(value1 + value2);
        return  value1 + value2;
    }
    /**
     * This is a method to calculate the difference of two values.
     * @param value1 first value from annotation.
     * @param value2 second vaue from annotation.
     * @return This method returning the difference of value1 and value2.
     */
    @MyAnno(value1 = 5, value2 = 10)
    private int calcMinus(int value1, int value2){
        System.out.println(value1 - value2);
        return value1 - value2;
    }
    /**
     * This is a method to calculate the product of two values.
     * @param value1 first value from annotation.
     * @param value2 second vaue from annotation.
     * @return This method returning the product of value1 and value2.
     */
    @MyAnno(value1 = 5, value2 = 10)
    private int calcMultiply(int value1, int value2){
        System.out.println(value1 * value2);
        return value1 * value2;
    }
    /**
     * This is a method to calculate the quotient of two values.
     * @param value1 first value from annotation.
     * @param value2 second vaue from annotation.
     * @return This method returning the quotient of value1 and value2.
     */
    @MyAnno(value1 = 5, value2 = 10)
    private int calcDivide(int value1, int value2){
        System.out.println(value1 / value2);
        return value1 / value2;
    }



    public static void main(String[] args) {
        /**
         * @param link is created to get all methods which contains in the class.
         * @param cl is created to get a object of class Task1
         * @param methodForPlus is created to get a calcPlus method and use it.
         * @param calcMinus is created to get a calcMinus method and use it.
         * @param calcMultiply is created to get a calcMultiply method and use it.
         * @param calcDivide is created to get a calcMultiply method and use it.
         * @param calcAnno is created to get annotaion for methods using.
         * @param try is created to handle a NoSuchMethodException.
         */
         Task1 link = new Task1();
         Class<?> cl = Task1.class;
         try{
             Method methodForPlus = cl.getDeclaredMethod("calcPlus", int.class, int.class);
             Method methodForMinus = cl.getDeclaredMethod("calcMinus",int.class, int.class);
             Method methodFopMultiply = cl.getDeclaredMethod("calcMultiply", int.class, int.class);
             Method methodForDivide = cl.getDeclaredMethod("calcDivide", int.class, int.class);
             MyAnno calcAnno = methodForPlus.getAnnotation(MyAnno.class);
             calcAnno = methodForMinus.getAnnotation(MyAnno.class);
             calcAnno = methodFopMultiply.getAnnotation(MyAnno.class);
             calcAnno = methodForDivide.getAnnotation(MyAnno.class);
             /**
              * Here we transferring values from annotation to each method/
              */
             link.calcPlus(calcAnno.value1(), calcAnno.value2());
             link.calcMinus(calcAnno.value1(), calcAnno.value2());
             link.calcMultiply(calcAnno.value1(), calcAnno.value2());
             link.calcDivide(calcAnno.value1(), calcAnno.value2());

         }catch(NoSuchMethodException e){
             e.printStackTrace();
         }
    }
}

/**
 * @MyAnno it's an Annotation created to provide values to method's
 * This annotation can be used only for Methods and have a retention only for Runtime.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    int value1();
    int value2();
}
