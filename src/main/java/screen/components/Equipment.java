package screen.components;

import java.util.ArrayList;
import java.util.List;

public class Equipment {

    public static List<Item> eq = new ArrayList<>();

    public static void add(Item item){
        eq.add(item);
    }

    public static List<Item> getEq(){
        return eq;
    }

}
