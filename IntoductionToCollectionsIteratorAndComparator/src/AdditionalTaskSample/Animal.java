package AdditionalTaskSample;

;

public class Animal implements Comparable { // <Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }


    public int compareTo(Object o) {
        int tmp = this.speed - ((Animal)o).speed;

        if (tmp == 0) {
            return this.price - ((Animal)o).price;
        } else {
            return tmp;
        }
    }
}
