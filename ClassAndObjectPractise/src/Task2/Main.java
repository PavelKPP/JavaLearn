package Task2;

public class Main {
    public static void main(String[] args) {
        Car carWithOneParameter = new Car(1996);
        Car carWithTwoParameters = new Car(2016, 268.7);
        Car carWithThreeParameters = new Car(2005, 220.0, 2700);
        Car carWithFourParameters = new Car(2022, 330.7, 1900, "Deep Purple");

        System.out.println("Overloading of  the first Parameter: " + carWithOneParameter.Year);
        System.out.println("Overloading of the second Parameter: " + carWithTwoParameters.Year + ", " + carWithTwoParameters.Speed);
        System.out.println("Overloading of the third Parameter: " + carWithThreeParameters.Year + ", " + carWithThreeParameters.Speed + ", " + carWithThreeParameters.Weight);
        System.out.println("Overloading of the fourth Parameter: " + carWithFourParameters.Year + ", "+ carWithFourParameters.Speed + ", " + carWithFourParameters.Weight + ", " + carWithFourParameters.Color);

    }
}
