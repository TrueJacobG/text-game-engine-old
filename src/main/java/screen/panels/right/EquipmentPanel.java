package screen.panels.right;

import game.components.Equipment;
import game.constants.Size;
import game.elements.Item;
import screen.buttons.ItemButton;

import javax.swing.*;
import java.awt.*;

public class EquipmentPanel extends JPanel {

    public EquipmentPanel(){
        this.setLayout(new GridLayout(Size.equipmentPanelRows,Size.equipmentPanelCols));

        this.setBorder(BorderFactory.createEmptyBorder(Size.equipmentPanelBorder, Size.equipmentPanelBorder, Size.equipmentPanelBorder, Size.equipmentPanelBorder));
        this.setBackground(Color.BLUE);
        this.addEq();
    }

    private void addEq() {
        for(Item i : Equipment.getAllEq()){
            this.add(new ItemButton(i));
        }

        if(Equipment.getNumberOfEqItems() < Size.equipmentPanelRows * Size.equipmentPanelCols){
            for(int i = Equipment.getNumberOfEqItems(); i < Size.equipmentPanelRows * Size.equipmentPanelCols; i++){
                this.add(new ItemButton(new Item()));
            }
        }

    }
}
