package screen.panels.center;

import javax.swing.*;
import java.awt.*;

public class StoryPanel extends JPanel {

    private String text = "story intro";
    private JLabel label = new JLabel();

    public StoryPanel(){
        this.setBackground(Color.MAGENTA);
        this.add(label);
    }

    public void changeText(String text) {
        label.setText("Story" + text);
    }
}
