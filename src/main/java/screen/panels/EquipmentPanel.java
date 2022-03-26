package screen.panels;

import game.components.Equipment;
import game.components.Item;
import screen.buttons.ItemButton;

import javax.swing.*;
import java.awt.*;

public class EquipmentPanel extends JPanel {
    public EquipmentPanel(){
        this.setLayout(new FlowLayout());

        this.setBorder(BorderFactory.createEmptyBorder(10, 2, 10, 2));
        this.setBackground(Color.BLUE);
        this.addEq();
    }

    private void addEq() {
        for(Item i : Equipment.getAllEq()){
            this.add(new ItemButton(i));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
