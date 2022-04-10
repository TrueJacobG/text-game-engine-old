package screen.panels.left;


import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    public LeftPanel(){
        this.setLayout(new GridLayout(1,1));
        this.setBackground(Color.YELLOW);
        this.add(new MapPanel());
    }
}
