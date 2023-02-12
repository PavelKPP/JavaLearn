package Task1;

class Vehicle {
    void print(){
        System.out.println("Print from Vehicle class.");
    }
     class Wheel{
        void print(){
            System.out.println("Print from Class Wheel.");
        }
    }

    class Door{
        void print(){
            System.out.println("Print from Class Door.");
        }
    }
}


public class Main{
    public static void main(String[] args) {
        Vehicle vehicleLink = new Vehicle();
        Vehicle.Wheel wheelLink = new Vehicle().new Wheel();
        Vehicle.Door doorLink = new Vehicle().new Door();

        vehicleLink.print();
        wheelLink.print();
        doorLink.print();
    }

}
