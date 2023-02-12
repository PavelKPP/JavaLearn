import java.util.ArrayList;
import java.util.Scanner;

enum Animals{

    CAT, BIRD, DOG, SHARK, BEAR, TIGER;
    int age;
    int getAge(int age){
        this.age = age;
        return age;
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animals cat = Animals.CAT;
        cat.getAge(6);
        Animals bird = Animals.BIRD;
        bird.getAge(1);
        Animals dog = Animals.DOG;
        dog.getAge(8);
        Animals shark = Animals.SHARK;
        shark.getAge(21);
        Animals bear = Animals.BEAR;
        bear.getAge(11);
        Animals tiger = Animals.TIGER;
        tiger.getAge(12);

        ArrayList<String> animalsArray = new ArrayList<>();

        animalsArray.add("Cat");
        animalsArray.add("Bird");
        animalsArray.add("Dog");
        animalsArray.add("Shark");
        animalsArray.add("Bear");
        animalsArray.add("Tiger");

        System.out.println(animalsArray);
        System.out.println("Choose your animal to get their age!");

        String inputAnimalName;
        inputAnimalName = sc.nextLine();

        switch(inputAnimalName){
            case "Cat":
                System.out.println("Animal: " + Animals.CAT + ", Age: " + cat.age);
                break;
            case "Bird":
                System.out.println("Animal: " + Animals.BIRD + ", Age: " + bird.age);
                break;
            case "Dog":
                System.out.println("Animal: " + Animals.DOG + ", Age: " + dog.age);
                break;
            case "Shark":
                System.out.println("Animal: " + Animals.SHARK + ", Age: " + shark.age);
                break;
            case "Bear":
                System.out.println("Animal: " + Animals.BEAR + ", Age: " + bear.age);
                break;
            case "Tiger":
                System.out.println("Animal: " + Animals.TIGER + ", Age: " + tiger.age);
            default:
                System.out.println("Our zoo doesnt have this animal.");
        }
    }
}
