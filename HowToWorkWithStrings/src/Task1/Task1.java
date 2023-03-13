package Task1;

import java.lang.module.FindException;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String text = "Каждая строка, создаваемая с помощью оператора new или с помощью литерала (заключённая в\n" +
                "двойные апострофы), является объектом класса String.\n" +
                "Особенностью объекта класса String является то, что его значение не может быть изменено после\n" +
                "создания объекта при помощи какого-либо метода класса, так как любое изменение строки приводит к\n" +
                "созданию нового объекта.";


        String finalText = "";


        String[] words = text.split(" ");
                for(String word : words){
                    String firstWord = words[0];
                     words[0] = words[words.length - 1];
                     words[words.length - 1] = firstWord;
                    for(int i = 0; i < 2; i++){
                        finalText = Arrays.toString(words);
                        System.out.println(finalText);
                    }
                }

    }
}
