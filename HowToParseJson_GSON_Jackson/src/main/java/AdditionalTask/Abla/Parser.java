package AdditionalTask.Abla;

import AdditionalTask.Currency;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Parser {
    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        Currency[] currencies = gson.fromJson(jsonReader, Currency[].class);

        for (Currency currency : currencies){
            if(currency.getName().equals("Новий ізраїльський шекель") || currency.getName().equals("Австралійський долар") || currency.getName().equals("Рупія")){
                System.out.println(currency);
            }
        }

        String gsonString = gson.toJson(currencies);

        Files.write(Paths.get("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\HowToParseJson_GSON_Jackson\\src\\main\\resources\\AdditionalTask.json"),
                gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
