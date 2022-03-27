package screen.panels;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new BorderLayout());

        JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        sp.setResizeWeight(0.7);
        sp.setEnabled(false);
        sp.setDividerSize(0);

        StoryPanel top = new StoryPanel();

        sp.add(top);
        sp.add(new DecisionPanel(top));

        this.add(sp);
    }
}
