package game.components;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

import com.google.gson.Gson;
import database.logs.MyLogger;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class Equipment {

    private static List<Item> allEqItems = new ArrayList<>();
    private static HashSet<String> indexesOfItems = new HashSet<>();

    private static Map<String, Item> onYou = new HashMap<>();
    private static Map<String, Item> armors = new HashMap<>();
    private static Map<String, Item> weapons = new HashMap<>();
    private static Map<String, Item> defenseWeapons = new HashMap<>();
    private static Map<String, Item> keyItems = new HashMap<>();
    private static Map<String, Item> other = new HashMap<>();

    public static void init(){
        Map<String, Map<String, Map<String, String>>> map;
        try {
            map = new Gson().fromJson(
                    new FileReader("src/main/java/database/character/equipment.json"),
                    Map.class);
        } catch (FileNotFoundException e) {
            System.out.println("File equipment.json not found!");
            MyLogger.info(ExceptionUtils.getStackTrace(e));
            throw new RuntimeException(e);

        }

        for(String category : map.keySet()){
            Map<String, Map<String, String>> map2 = map.get(category);
            for(String primitiveName : map2.keySet()){
                Map<String, String> map3 = map2.get(primitiveName);
                List<String> properties = new ArrayList<>(map3.values());

                Item item = new Item(properties.get(0), properties.get(1), properties.get(2), properties.get(3), properties.get(4));

                switch (category) {
                    case "onYou" -> onYou.put(primitiveName, item);
                    case "armors" -> armors.put(primitiveName, item);
                    case "weapons" -> weapons.put(primitiveName, item);
                    case "defenseWeapons" -> defenseWeapons.put(primitiveName, item);
                    case "keyItems" -> keyItems.put(primitiveName, item);
                    case "other" -> other.put(primitiveName, item);
                }

                if(!(indexesOfItems.contains(properties.get(0)))){
                    allEqItems.add(item);
                    indexesOfItems.add(properties.get(0));
                }

            }
        }

    }

    public static void addItemToList(Item item){
        allEqItems.add(item);
    }

    public static List<Item> getAllEq(){
        return allEqItems;
    }

    public static Map<String, Item> getOnYou(){
        return onYou;
    }

}
