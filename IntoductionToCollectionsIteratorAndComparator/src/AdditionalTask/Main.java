package AdditionalTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("X5" , "Apple" , 110000, 320);
        Car mercedes = new Car("s63amg", "Silver", 125000, 320);
        Car audi = new Car("rs6", "Black", 110000, 320);

        Car[] carList = {bmw, mercedes, audi};

        Arrays.sort(carList);

        for (Car temp : carList){
            System.out.println(temp);
        }
    }
}
