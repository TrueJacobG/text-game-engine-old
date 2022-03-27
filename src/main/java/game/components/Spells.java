package game.components;

import com.google.gson.Gson;
import database.logs.MyLogger;
import game.elements.Spell;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Spells {
    private static List<Spell> spellsAsList = new ArrayList<>();

    public static void init(){
        Map<String, Map<String, String>> spells;

        try {
            spells = new Gson().fromJson(
                    new FileReader("src/main/java/database/character/spells.json"),
                    Map.class);
        } catch (FileNotFoundException e) {
            System.out.println("File spells.json not found!");
            MyLogger.info(ExceptionUtils.getStackTrace(e));
            throw new RuntimeException(e);
        }

        for(String spellName : spells.keySet()){
            Map<String, String> info= spells.get(spellName);

            Spell spell = new Spell(spellName, info.get("cost"), info.get("other"));

            spellsAsList.add(spell);

        }

    }

    public static void addSpell(Spell spell){
        spellsAsList.add(spell);
    }

    public static List<Spell> getSpells(){
        return spellsAsList;
    }

}
