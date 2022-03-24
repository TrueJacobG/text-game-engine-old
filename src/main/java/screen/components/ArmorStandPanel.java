package screen.components;

import javax.swing.*;
import java.awt.*;

public class ArmorStandPanel extends JPanel {
    public ArmorStandPanel(){
        this.setLayout(new GridLayout(4, 2));
        this.setBackground(Color.WHITE);
        this.addEq();
    }

    private void addEq() {
        this.add(new JPanel());
        this.add(new Item("Helmet"));
        this.add(new JPanel());

        this.add(new Item("Weapon"));
        this.add(new Item("Chestplate"));
        this.add(new Item("Shield"));

        this.add(new JPanel());
        this.add(new Item("Pants"));
        this.add(new JPanel());

        this.add(new JPanel());
        this.add(new Item("Boots"));
        this.add(new JPanel());
    }
}
