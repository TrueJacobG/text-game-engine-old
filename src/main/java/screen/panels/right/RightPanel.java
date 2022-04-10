package screen.panels.right;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    public RightPanel(){
        this.setBackground(Color.PINK);

        this.setLayout(new GridLayout(3, 1));

        this.add(new ArmorStandPanel());
        this.add(new EquipmentPanel());
        this.add(new SpellsPanel());
    }
}
