package ExtraTask;

import Task2.Title;

import java.util.Scanner;

public class Address {
     String Index;
     String Country;
     String City;
     String Street;
     String House;
     String Apartment;

    public Address(){

    }

    public String getIndex() {
        return Index;
    }

    public void setIndex(String index) {
        Index = index;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public String getApartment() {
        return Apartment;
    }

    public void setApartment(String apartment) {
        Apartment = apartment;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put your index, country, city, street, house, apartment. Alternately.");
        Address address = new Address();

        address.setIndex(sc.nextLine());
        address.getIndex();

        address.setCountry(sc.nextLine());
        address.getCountry();

        address.setCity(sc.nextLine());
        address.getCity();

        address.setStreet(sc.nextLine());
        address.getStreet();

        address.setHouse(sc.nextLine());
        address.getHouse();

        address.setApartment(sc.nextLine());
        address.getApartment();

        address.out();


    }
    void out(){
        System.out.println("Your Index: " + Index);
        System.out.println("Your Country: " + Country);
        System.out.println("Your City: " + City);
        System.out.println("Your Street: " + Street);
        System.out.println("Your House: " + House);
        System.out.println("Your Apartment: " + Apartment);

    }

}
