package AdditionalTask;

import java.lang.annotation.*;
import java.lang.reflect.Method;




public class AdditionalTask {
    @MathAnno(num1 = 100, num2 = 100)
    @MathAnno(num1 = 500, num2 = 1000)
    private int MathSum(int value1, int value2){
        return value1 + value2;
    }
    public static void main(String[] args) throws NoSuchMethodException {
        AdditionalTask additionalTask = new AdditionalTask();
        Class<?> cl = AdditionalTask.class;
        Method method = cl.getDeclaredMethod("MathSum", int.class, int.class);
        MathAnnos mathAnno = method.getAnnotation(MathAnnos.class);
        for(int i = 0; i < 2; i++){
            System.out.println(additionalTask.MathSum(mathAnno.value()[i].num1(), mathAnno.value()[i].num2()));

        }

    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MathAnnos{
    MathAnno[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(MathAnnos.class)
@interface MathAnno{
    int num1() default 0;
    int num2() default 0;
}

