package Generics;

class homeAnimal{
    int weight;
    String Breed;
    int age;

    homeAnimal(){

    }
    homeAnimal(int weight, String breed, int age){
        this.weight = weight;
        this.Breed = breed;
        this.age = age;
    }

    void greetings(){
        System.out.println("Pet's available: ");
    }
}

class Dog extends homeAnimal{

    Dog(int weight, String breed, int age){
        super(weight, breed, age);
    }
}

class Cat extends homeAnimal{

    Cat(int weight, String breed, int age){
        super(weight, breed, age);
    }

}




class Generic<T extends homeAnimal>{
    T[] mass;

    Generic(T[] mass){
        this.mass = mass;
    }

    void arrDisplay(){
        for (T temp : mass){
            System.out.println("Age: " + temp.age + " Breed: " + temp.Breed + " Weight: " + temp.weight);
        }
    }

    int weightController(){
        int sum = 0;
        for(T temp : mass){
            sum += temp.weight;
        }
        System.out.println(sum);
        return sum;
    }
}




public class Main {
    public static void main(String[] args) {
        homeAnimal homeAnimal = new homeAnimal();
        Dog[] dog = {new Dog(20, "Labrador", 5), new Dog(11, "Border Colee", 3)};
        Cat[] cat = {new Cat(8, "British", 8), new Cat(4, "Sphinx", 11)};
        Generic<Dog> d = new Generic<>(dog);
        Generic<Cat> c = new Generic<>(cat);

        homeAnimal.greetings();
        System.out.println("Dogs: ");
        d.arrDisplay();
        System.out.println("Cats: ");
        c.arrDisplay();

        System.out.println("Weight total: ");
        d.weightController();
        c.weightController();
    }
}