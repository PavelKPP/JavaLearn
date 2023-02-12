package Task3;

public class Main {
    public static void main(String[] args) {
        Car carWithOneParameter = new Car(2006);
        Car carWithTwoParameters = new Car(2008, 260.80);
        Car carWithThreeParameters = new Car(1998, 190.5, 2500);
        Car carWithFourParameters = new Car(2022, 280.5, 2200, "Forest Green");

        System.out.println("Overloading of  the first Parameter: " + carWithOneParameter.Year);
        System.out.println("Overloading of the second Parameter: " + carWithTwoParameters.Year + ", " + carWithTwoParameters.Speed);
        System.out.println("Overloading of the third Parameter: " + carWithThreeParameters.Year + ", " + carWithThreeParameters.Speed + ", " + carWithThreeParameters.Weight);
        System.out.println("Overloading of the fourth Parameter: " + carWithFourParameters.Year + ", "+ carWithFourParameters.Speed + ", " + carWithFourParameters.Weight + ", " + carWithFourParameters.Color);

    }
}
