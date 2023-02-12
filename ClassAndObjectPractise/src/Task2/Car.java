package Task2;

public class Car {
    int Year;
    double Speed;
    int Weight;
    String Color;

    public Car(int year){
        this.Year = year;
    }

    public Car(int year, double speed){
        this.Year = year;
        this.Speed = speed;
    }

    public Car(int year, double speed, int weight){
        this.Year = year;
        this.Speed = speed;
        this.Weight = weight;
    }

    public Car(int year, double speed, int weight, String color){
        this.Year = year;
        this.Speed = speed;
        this.Weight = weight;
        this.Color = color;
    }

}
