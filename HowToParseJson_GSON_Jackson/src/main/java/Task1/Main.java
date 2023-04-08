package Task1;

import Task1.Parser.JacksonDataBind;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonDataBind.parseJson("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\HowToParseJson_GSON_Jackson\\src\\main\\resources\\country.json");
    }
}


