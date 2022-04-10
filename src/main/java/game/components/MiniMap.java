package game.components;

import com.google.gson.Gson;
import database.logs.MyLogger;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class MiniMap {

    private static String[] cities = new String[25];

    public static void init() {
        Map<String, Map<String, Map<String, String>>> map;
        try {
            map = new Gson().fromJson(
                    new FileReader("src/main/java/database/story/locations.json"),
                    Map.class);
        } catch (FileNotFoundException e) {
            System.out.println("File locations.json not found!");
            MyLogger.info(ExceptionUtils.getStackTrace(e));
            throw new RuntimeException(e);
        }

        int x = 0;
        for(String city : map.keySet()){
            cities[x++] = city;
            //Map<String, Map<String, String>> neighbors = map.get(city);
        }

        while(cities.length < 25){
            cities[x++] = "";
        }
    }


    public static String[] getGrid(){
        return cities;
    }
}
