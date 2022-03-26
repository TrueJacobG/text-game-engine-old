package screen.panels;

import game.components.Equipment;
import game.components.Item;

import javax.swing.*;
import java.awt.*;

public class SpellsPanel extends JPanel {
    public SpellsPanel(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GREEN);
        this.addEq();
        this.setVisible(true);
    }

    private void addEq() {
    }
}
