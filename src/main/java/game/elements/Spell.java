package game.elements;

public class Spell {
    private String name;
    private String cost;
    private String other;

    public Spell(String name, String cost, String other) {
        this.name = name;
        this.cost = cost;
        this.other = other;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }
}
