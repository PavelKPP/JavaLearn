package Task1.Parser;

import Task2.Entity.Country;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonDataBind {
    public static void parseJson(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Country countries =objectMapper.readValue(new FileReader(path), Country.class);


        System.out.println(countries);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(countries);

        Files.write(Paths.get("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\HowToParseJson_GSON_Jackson\\src\\main\\resources\\Task1.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);

    }
}
