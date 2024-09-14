package org.example.ob_havo.obHavo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.ob_havo.module.Root;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Ob_Havo  {


    public String getObHavo(double latitude,double longitude) {
        String obHavo = "--\n";

        final String API = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude + "&current_weather=true&hourly=temperature_2m,relativehumidity_2m,windspeed_10m";
        Gson gson = new Gson();
        List<String> list = new ArrayList<>();
        URL url = null;
        URLConnection connection = null;
        BufferedReader reader = null;
        try {
            url = new URL(API);
            connection = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String langs = "";
            String line = null;

            while ((line = reader.readLine()) != null) {
                langs += line;
            }

            System.out.println(langs);
//         ⏰⏳☀️🌤⛅️☁️🌦🌧❄️⛈🌨💨💧
            Type type = new TypeToken<Root>() {
            }.getType();
            Root root = gson.fromJson(langs, Root.class);
            obHavo+="⏳ vaqt zonasi: "+root.timezone+"\n";
//            obHavo+="timezone abbreviation: "+root.timezone_abbreviation+"\n";
            if (root.current_weather.temperature<=5){
                obHavo+="☁\uFE0F";
            } else if (root.current_weather.temperature>5&&root.current_weather.temperature<=30) {
                obHavo+="☀\uFE0F";
            } else if (root.current_weather.temperature>30) {
                obHavo+="⚡\uFE0F";
            }
            obHavo+="harorat: "+root.current_weather.temperature+root.current_weather_units.winddirection+"\n";
//            obHavo+="current_weather_units: "+root.current_weather_units.winddirection+"\n";
            obHavo+="shamol balandligi: "+root.elevation+"\n";
//            obHavo+="generationtime ms: "+root.generationtime_ms+"\n";


            obHavo+="\uD83D\uDCA8";

            if (root.current_weather.winddirection==0){
                obHavo+="shimoldan";
            } else if (root.current_weather.winddirection==90) {
                obHavo+="sharqdan";
            }

         else if (root.current_weather.winddirection==180) {
            obHavo+="janubdan";
        }
         else if (root.current_weather.winddirection==270) {
            obHavo+="g`arbdan";
        }
         else if (root.current_weather.winddirection==360) {
             obHavo+="shimoldan";
            }
            else if (root.current_weather.winddirection>0&&root.current_weather.winddirection<90) {
                obHavo+="shimoliy shardan";
            }
            else if (root.current_weather.winddirection>90&&root.current_weather.winddirection<180) {
                obHavo+="janubiy sharqiy";
            }
            else if (root.current_weather.winddirection>180&&root.current_weather.winddirection<270) {
                obHavo+="janubiy g`arbdan";
            }

            else if (root.current_weather.winddirection>270&&root.current_weather.winddirection<360) {
                obHavo+="shimoliy g`arbdan";
            }
            obHavo+=" ";
            obHavo+=root.getCurrent_weather().windspeed+root.hourly_units.windspeed_10m+" tezlikda shamol esmoqda\n";

            int sum=0;
            for (int i = 0; i < root.hourly.relativehumidity_2m.size(); i++) {
                sum+=root.hourly.relativehumidity_2m.get(i);
            }
            sum=(sum/root.hourly.relativehumidity_2m.size());

            obHavo+="\uD83D\uDCA7namlik : "+sum+"%\n";
            return obHavo;

        }catch (Exception e){
            return obHavo;
        }
    }


}
