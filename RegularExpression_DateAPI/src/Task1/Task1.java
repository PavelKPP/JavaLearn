package Task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {
    String fileName = "C:\\Users\\Pavel Kuzhel\\IdeaProjects\\RegularExpression_DateAPI\\src\\Task1\\Text.txt";
    String contens = readUsingScanner(fileName);
        System.out.println(contens);
        System.out.println("----------------");
        Pattern pattern = Pattern.compile("but");
        Matcher matcher = pattern.matcher(contens);

        System.out.println(matcher.replaceAll("Java"));

    }
    private static String readUsingScanner (String filename) throws IOException{
        Scanner sc = new Scanner(Paths.get(filename), StandardCharsets.UTF_8.name());
        String data = sc.useDelimiter("\\A").next();
        sc.close();
        return data;
    }
}
   // Pattern pattern = Pattern.compile("[but]");
    //Matcher Matcher = pattern.matcher((char) iS.read());
//C:\\Users\\Pavel Kuzhel\\IdeaProjects\\RegularExpression_DateAPI\\src\\Task1\\Text.txt"