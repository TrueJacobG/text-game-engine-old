import game.Game;
import game.components.Equipment;
import game.components.Item;

public class Main {
    public static void main(String[] args){
        Equipment.init();

        System.out.println("All items: ");
        for(Item i : Equipment.getEq()){
            System.out.println(i);
        }

        System.out.println("On you: ");
        for(Item i : Equipment.getOnYou()){
            System.out.println(i);
        }

        //Game.run();

    }
}
