package screen.panels;

import screen.buttons.DecisionButton;

import javax.swing.*;
import java.awt.*;

public class DecisionPanel extends JPanel {

    private StoryPanel panel;

    DecisionPanel(StoryPanel panel){
        this.panel = panel;
        this.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(2,2));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        p1.setLayout(new GridLayout(1,1));
        p2.setLayout(new GridLayout(1,1));
        p3.setLayout(new GridLayout(1,1));
        p4.setLayout(new GridLayout(1,1));

        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        p1.add(new DecisionButton("hello", panel));
        p2.add(new DecisionButton("test",panel));
        p3.add(new DecisionButton("ttt",panel));
        p4.add(new DecisionButton("world",panel));

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

    }
}