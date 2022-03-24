package screen.components;

import javax.swing.*;
import java.awt.*;

public class EquipmentPanel extends JPanel {
    public EquipmentPanel(){
        this.addEq();
        this.setLayout(new FlowLayout());
        this.setBackground(Color.WHITE);
    }

    private void addEq() {
        this.add(new Item("test1"));
        this.add(new Item("test2"));
        this.add(new Item("test3"));
        this.add(new Item("test4"));
        this.add(new Item("test5"));
    }
}
