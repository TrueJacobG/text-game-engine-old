package game.elements;

public class Item{
    private String id;
    private String name;
    private String durability;
    private String type;
    private String info;

    // empty eq box
    public Item(){
        this.name = "";
    }

    public Item(String id, String name, String durability, String type, String info){
        this.id = id;
        this.name = name;
        this.durability = durability;
        this.type = type;
        this.info = info;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }

    public boolean isItem(){
        return ! name.equals("");
    }

}
