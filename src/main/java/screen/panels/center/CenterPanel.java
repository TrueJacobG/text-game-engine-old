package screen.panels.center;

import screen.buttons.DecisionButton;
import screen.buttons.ItemButton;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    public CenterPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new BorderLayout());

        JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        sp.setResizeWeight(0.85);
        sp.setEnabled(false);
        sp.setDividerSize(0);

        StoryPanel storyPanel = new StoryPanel();
        EqOptionPanel eqOption = new EqOptionPanel();

        ItemButton.addPanels(eqOption, storyPanel);
        DecisionButton.addPanels(eqOption, storyPanel);

        JPanel twoScreens = new JPanel(new CardLayout());
        twoScreens.add(eqOption);
        twoScreens.add(storyPanel);

        sp.add(twoScreens);
        sp.add(new DecisionPanel());

        this.add(sp);
    }
}
