package Task2;

import Task2.Parser.GsonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       GsonParser.parseJson("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\HowToParseJson_GSON_Jackson\\src\\main\\resources\\country.json");
    }
}
