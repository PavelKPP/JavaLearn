
class Sasha<T>{
    T age;

    void print(){
        System.out.println(age);
    }
}


public class Main {
    public static void main(String[] args) {

        Sasha<String> SashaBukvenooe = new Sasha<>();
        SashaBukvenooe.age = "Devyatnadsat'";

        Sasha<Integer> SashaCifernoe = new Sasha<>();
        SashaCifernoe.age = 19;

        SashaBukvenooe.print();
        SashaCifernoe.print();

    }
}
