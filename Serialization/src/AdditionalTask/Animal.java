package AdditionalTask;

import java.io.*;

public class Animal implements Externalizable{
    private int age;
    private static String genus;
    private transient int size;
    private String country;


    public Animal(){

    }

    public Animal(int age, String genus, int size, String country){
        this.age = age;
        this.genus = genus;
        this.size = size;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getGenus() {
        return genus;
    }

    public static void setGenus(String genus) {
        Animal.genus = genus;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", size=" + size +
                ", country='" + country + ", genus=" + genus + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(age);
        out.writeObject(genus);
        out.writeInt(size);
        out.writeObject(country);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        age = in.readInt();
        genus = (String) in.readObject();
        size = in.readInt();
        country = (String) in.readObject();
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new Animal(1000,"arthopods", 50, "Taiwan");

        File file = new File("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\Serialization\\src\\AdditionalTask\\AdditionalTask.txt");


        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));){

            outputStream.writeObject(animal);

            animal = (Animal) inputStream.readObject();

            System.out.println(animal);

        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}



