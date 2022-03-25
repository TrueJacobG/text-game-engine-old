package game.components;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import database.logs.MyLogger;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class Equipment {

    public static List<Item> allEqItems = new ArrayList<>();
    public static HashSet<String> indexesOfItems = new HashSet<>();

    public static List<Item> onYou = new ArrayList<>();
    public static List<Item> armors = new ArrayList<>();
    public static List<Item> weapons = new ArrayList<>();
    public static List<Item> defenseWeapons = new ArrayList<>();
    public static List<Item> keyItems = new ArrayList<>();
    public static List<Item> other = new ArrayList<>();

    public static void init(){
        Map<String, Map<String, Map<String, String>>> map = null;
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

                switch(category){
                    case "onYou":
                        onYou.add(item);
                        break;
                    case "armors":
                        armors.add(item);
                        break;
                    case "weapons":
                        weapons.add(item);
                        break;
                    case "defenseWeapons":
                        defenseWeapons.add(item);
                        break;
                    case "keyItems":
                        keyItems.add(item);
                        break;
                    case "other":
                        other.add(item);
                        break;
                }

                if(!(indexesOfItems.contains(properties.get(0)))){
                    allEqItems.add(item);
                    indexesOfItems.add(properties.get(0));
                }

            }
        }

    }

    public static void addItem(Item item){
        allEqItems.add(item);
    }

    public static List<Item> getEq(){
        return allEqItems;
    }

    public static List<Item> getOnYou(){
        return onYou;
    }

}
