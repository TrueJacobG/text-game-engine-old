package screen.panels.center;

import javax.swing.*;
import java.awt.*;

public class EqOptionPanel extends JPanel {

    private String text = "eq intro";
    private JLabel label = new JLabel();

    public EqOptionPanel(){
        this.setBackground(Color.MAGENTA);
        this.add(label);
    }

    public void changeText(String text) {
        label.setText("eq here " + text);
    }
}
