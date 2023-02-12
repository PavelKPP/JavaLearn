package Task2;

public class Distance {
    static double distance;

        Distance(int dist){
        this.distance = dist;
    }

    void print(){
        System.out.println("Converted : " + distance);
    }

        static class Converter{

            void cmToDm(){
                distance *= 0.1;
            }

            void dmToM(){
                distance *= 0.1;
            }

            void mToKm(){
                distance *= 0.001;
            }

            void kmToMl(){
                distance *= 0.621371;
            }

        }


}
