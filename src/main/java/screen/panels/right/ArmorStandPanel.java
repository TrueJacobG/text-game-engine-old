package screen.panels.right;

import game.components.Equipment;
import game.elements.Item;
import screen.buttons.ItemButton;

import javax.swing.*;
import java.awt.*;
import java.util.Map;


public class ArmorStandPanel extends JPanel {
    public ArmorStandPanel(){
        this.setLayout(new GridLayout(4, 3));
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setBackground(Color.PINK);
        this.addToPanel();
    }

    private void addToPanel() {
        Map<String, Item> onYou = Equipment.getOnYou();

        this.add(new JPanel());
        this.add(new ItemButton(onYou.get("helmet")));
        this.add(new JPanel());

        this.add(new ItemButton(onYou.get("sword")));
        this.add(new ItemButton(onYou.get("chestplate")));
        this.add(new ItemButton(onYou.get("shield")));

        this.add(new JPanel());
        this.add(new ItemButton(onYou.get("pants")));
        this.add(new JPanel());

        this.add(new JPanel());
        this.add(new ItemButton(onYou.get("boots")));
        this.add(new JPanel());
    }
}
