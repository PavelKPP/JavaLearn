package Task2;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String shopName;

        Price price = new Price();

        System.out.println("FullFill the array in order: Name of the shop, Name of the Product, Price of the product.");

        price.nameoOfShop = sc.next();
        price.nameOfProduct = sc.next();
        price.price = sc.nextInt();

        Price[] arr = {new Price(price.nameoOfShop, price.nameOfProduct, price.price)};

        System.out.println("Put the name of shop, which you are looking for: ");
        shopName = sc.next();



       if (Objects.equals(price.nameoOfShop, shopName)) {
            System.out.println("Here we have: " + price.nameOfProduct);
            System.out.println(price.nameOfProduct+ ":" + price.price);
        }
            try {
                if (!Objects.equals(price.nameoOfShop, shopName)) {
                    throw new Exception("Shop name Exception");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("There is no shop with name like that.");
            }
    }

}

