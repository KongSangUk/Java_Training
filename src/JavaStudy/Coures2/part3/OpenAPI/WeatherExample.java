package JavaStudy.Coures2.part3.OpenAPI;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey = "발급받은 키정보 입력";
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {

                // 스트림(Stream = 입력,출력)의 연결
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println(content.toString());

                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
                double temp = mainData.get("temp").getAsDouble();

                System.out.println("Seoul's temperature: " + temp + "°C");

                connection.disconnect();

            } else {
                // 오류
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


