package Task1;

import java.util.Scanner;

public class ClassRoom {
    private String Atrem, Vlad, Ilya, Dmitriy;
    private String all;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pupil pupil = new Pupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();
        GoodPupil goodPupil = new GoodPupil();
        BadPupil badPupil = new BadPupil();

        String inputName;

        System.out.println("Choose a student to check academic performance:");
        System.out.println("Artem, Vlad, Ilya, Dmitriy");

        inputName = sc.nextLine();

        switch (inputName){
            case "Artem":
                excelentPupil.excelentPupilMeth();
                break;
            case "Vlad":
                goodPupil.goodPupilMeth();
                break;
            case "Ilya":
                goodPupil.excelentPupilMeth();
                break;
            case "Dima":
                badPupil.badPupilMethod();
            case "All":
                System.out.println("Artem: ");
                excelentPupil.excelentPupilMeth();
                System.out.println("Vlad: ");
                goodPupil.goodPupilMeth();
                System.out.println("Ilya: ");
                goodPupil.excelentPupilMeth();
                System.out.println("Dima: ");
                badPupil.badPupilMethod();
                break;
            default:
                System.out.println("Wrong name");

        }








    }
}