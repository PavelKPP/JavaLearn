package Task2;

public class Animal {
    private String genus;
    private int age;
    private int weight;

    Animal(){

    }

    Animal(String genus, int age, int weight){
        this.genus = genus;
        this.age = age;
        this.weight = weight;
    }

    public Animal(Animal eagle){
        this(eagle.genus, eagle.age, eagle.weight);
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "genus='" + genus + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}


class Eagle extends Animal{


    public Eagle(String genus, int age, int weight) {
        super(genus, age, weight);
    }

    public static void main(String[] args) {
        Animal animal = new Eagle("Winged", 3, 15);
        Animal cloneEagle = new Animal(animal);

        System.out.println(animal);
        System.out.println(cloneEagle);
    }
}
