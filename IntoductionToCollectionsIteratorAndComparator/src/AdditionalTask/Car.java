package AdditionalTask;

public class Car implements Comparable{
    String model;

    String color;

    int price;

    int maxSpeed;


    Car(String model, String color, int price, int maxSpeed){
        this.model = model;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;

    }

    public String toString(){
        return this.model + " " + this.color + " " + this.price + " " + this.maxSpeed;
    }

    @Override
    public int compareTo(Object o) {
        int temp = this.maxSpeed - ((Car)o).maxSpeed;


        if( temp == 0){
            return this.price - ((Car)o).price;
        }else if(temp == 0){
            return this.model.compareTo(((Car)o).model);
        }else if(temp == 0){
            return this.color.compareTo(((Car)o).color);
        }else {
            return temp;
        }



    }
}
