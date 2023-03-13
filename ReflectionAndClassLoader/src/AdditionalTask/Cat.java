package AdditionalTask;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        try{
            Class<?> cl = Animal.class;
            Animal animal = new Animal();
            System.out.println("Bride - " + animal.bride + ". " + "Weight - " + animal.weight + ". " + "Price - " + animal.getPrice());
            Field StringField = cl.getDeclaredField("bride");
            Field intField = cl.getDeclaredField("weight");
            Field longField = cl.getDeclaredField("price");

            StringField.setAccessible(true);
            intField.setAccessible(true);
            longField.setAccessible(true);

            StringField.set(animal, "Dog");
            intField.setInt(animal, 100);
            longField.setLong(animal, 20000);

            System.out.println("Bride - " + StringField.get(animal) + ". " + "Weight - " + intField.getInt(animal) + ". " + "Price - " + longField.getLong(animal) + "." );

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
