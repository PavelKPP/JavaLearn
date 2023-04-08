package Task2;

import java.io.*;

public class Car implements Serializable {
    private String mark;
    private static String model;
    private  int price;

    //private transient int price;

    Car(){

    }

    Car(String mark, String model, int price){
        this.mark = mark;
        this.model = model;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", price=" + price + ", model=" + model +
                '}';
    }
}


class Main{
    public static void main(String[] args) {
        Car car = new Car("BMW", "m5Competition", 125000);

        File file = new File("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\Serialization\\src\\Task2\\Task2.txt");

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));){

            outputStream.writeObject(car);

            car = (Car) inputStream.readObject();

            System.out.println(car);


        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
