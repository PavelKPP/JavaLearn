package AdditionalTask;

public class Car implements Cloneable{
    private int max_speed;
    private int weight;
    private String color;

    Car(){

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    Car(int max_speed, int weight, String color){
        this.max_speed = max_speed;
        this.weight = weight;
        this.color = color;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "max_speed=" + max_speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public static Car getCarInstanceWithMaxSpeedWeightAndColor(Car carToCopy){
        Car instance = new Car();
        instance.max_speed = carToCopy.max_speed;
        instance.weight = carToCopy.weight;
        instance.color = carToCopy.color;
        return instance;
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car(300, 2200, "Graphit");

        try {
            Car clonedCar =  (Car) car.clone();
            System.out.println(car);
            System.out.println(clonedCar);
            System.out.println();
            clonedCar.setColor("Blue");
            clonedCar.setMax_speed(320);
            System.out.println(car);
            System.out.println(clonedCar);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        Car car2 = new Car(220, 1800, "Silver");
        Car clonedCar2 = Car.getCarInstanceWithMaxSpeedWeightAndColor(car2);

        System.out.println(car2);
        System.out.println(clonedCar2);


    }
}
