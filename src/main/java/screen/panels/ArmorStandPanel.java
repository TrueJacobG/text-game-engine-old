package screen.panels;

import game.components.Item;

import javax.swing.*;
import java.awt.*;

public class ArmorStandPanel extends JPanel {
    public ArmorStandPanel(){
        this.setLayout(new GridLayout(4, 2));
        this.setBackground(Color.WHITE);
        this.addEq();
    }

    private void addEq() {
    }
}
