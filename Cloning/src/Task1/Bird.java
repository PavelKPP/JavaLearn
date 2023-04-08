package Task1;

import java.io.*;

public class Bird implements Serializable{
    private transient String Color;
    private static int age;
    private String country = "UKraine";


    Bird(){

    }

    Bird(String color, int age, String country){
        this.Color = color;
        this.age = age;
        this.country = country;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Bird.age = age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Color='" + Color + '\'' +
                ", country='" + country + '\'' + ", age= " + age +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Bird synica = new Bird("Green-Blue", 3, "Ukraine");

        try {
            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteOutput);

            outputStream.writeObject(synica);
            outputStream.flush();
            outputStream.close();

            ByteArrayInputStream byteInput = new ByteArrayInputStream(byteOutput.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteInput);

            Bird cloneSynica = (Bird) inputStream.readObject();

            inputStream.close();

            System.out.println(synica);
            System.out.println(cloneSynica);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
