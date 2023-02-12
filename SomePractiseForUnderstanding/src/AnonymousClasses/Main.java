package AnonymousClasses;

class Car{
    String Brand;
    int year;

    Car(){

    }

    Car(String Brand, int year){
        this.Brand = Brand;
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Main bmw = new Main(){
            public void display(){
                System.out.println("My name is BMW");
            }
        };
    }
}
