package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.println("Put your value:");

        int valueInput;
        valueInput = sc.nextInt();

        Distance distanceLink = new Distance(valueInput);
        Distance.Converter converterLink = new Distance.Converter();

        System.out.println("Choose to convertation method: ");
        System.out.println("Cm to Dm");
        System.out.println("Dm to M");
        System.out.println("M to Km");
        System.out.println("Km to Ml");

        String inputVar;
        inputVar = scStr.nextLine();

        switch (inputVar){
            case "Cm to Dm":
                converterLink.cmToDm();
                distanceLink.print();
                break;
            case "Dm to M":
                converterLink.dmToM();
                distanceLink.print();
                break;
            case "M to Km":
                converterLink.mToKm();
                distanceLink.print();
                break;
            case "Km to Ml":
                converterLink.kmToMl();
                distanceLink.print();
        }






    }
}
