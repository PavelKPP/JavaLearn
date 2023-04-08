package Task1;

import java.io.*;

public class Animal implements Serializable {
    private int age;

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", bride='" + bride + '\'' +
                '}';
    }

    private String bride;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBride() {
        return bride;
    }

    public void setBride(String bride) {
        this.bride = bride;
    }

    Animal(){

    }

    Animal(int age, String bride){
        this.age = age;
        this.bride = bride;
    }

    static void move(){
        System.out.println("I can move");
    }

}


class Dog extends Animal implements Serializable{
    String color;
    int weight;

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    Dog(){

    }

    Dog(String color, int weight, String bride, int age){
        super(age, bride);
        this.color = color;
        this.weight = weight;
    }


    public static void main(String[] args) {
        Animal animal = new Animal(5, "Labrador");

        Dog dog = new Dog("Cream", 120, "Labrador", 5);

        File file = new File("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\Serialization\\src\\Task1\\Task1.txt");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));){

            outputStream.writeObject(dog);

            //dog = null;

            dog = (Dog) inputStream.readObject();

            System.out.println(dog);

            outputStream.writeObject(animal);

            animal = (Animal) inputStream.readObject();

            System.out.println(animal);

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
