
class Car{
    String model;
    class Engine{
        String engine;
        public void work(){
            System.out.println("Engine is working");
        }
    }
    Engine en = new Engine();

}






public class SomePracticOfAnonymousClass {
    public static void main(String[] args) {
        Car bmw = new Car(){
            void work(){
                System.out.println("My name is BMW");
            }
        };
        bmw.en.work();

    }
}
