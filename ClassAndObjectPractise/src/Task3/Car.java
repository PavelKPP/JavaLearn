package Task3;

public class Car {
    int Year;
    double Speed;
    int Weight;
    String Color;


    public Car(int year){
        this.Year = year;
    }

    public Car(int year, double speed){
        this(year);
        this.Speed = speed;
    }

    public Car(int year, double speed, int weight){
        this(year, speed);
        this.Weight = weight;
    }

    public Car(int year, double speed, int weight, String color){
        this(year, speed, weight);
        this.Color = color;
    }
}
