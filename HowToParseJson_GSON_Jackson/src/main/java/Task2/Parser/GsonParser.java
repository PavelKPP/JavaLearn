package Task2.Parser;

import Task2.Entity.Country;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseJson(String path) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new FileReader(path));

        Country countries = gson.fromJson(jsonReader, Country.class);


        System.out.println(countries);

        String gsonString = gson.toJson(countries);

        Files.write(Paths.get("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\HowToParseJson_GSON_Jackson\\src\\main\\resources\\Task2.json"),
                    gsonString.getBytes(), StandardOpenOption.CREATE);

    }
}
