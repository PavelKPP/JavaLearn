package Task2;

public class Task2 {

    public static void main(String[] args) {

        String text = "Каждая строка, создаваемая с помощью оператора new или с помощью литерала (заключённая в\n" +
                "двойные апострофы), является объектом класса String.\n" +
                "Особенностью объекта класса String является то, что его значение не может быть изменено после\n" +
                "создания объекта при помощи какого-либо метода класса, так как любое изменение строки приводит к\n" +
                "созданию нового объекта.";

        String [] subStr;

        String subStrPartOne;
        String subStrPartTwo;

        int determPos = (text.length() / 2) + 1;

        subStrPartOne = text.substring(0, determPos);
        subStrPartTwo = text.substring(determPos);


        System.out.println(subStrPartOne);
        System.out.println(subStrPartTwo);


        subStr = text.split("\\.");
        for(int i = 0; i < subStr.length; i++){
            System.out.println(subStr[i]);
        }

    }
}
