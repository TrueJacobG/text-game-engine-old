package screen.panels;

import screen.buttons.DecisionButton;

import javax.swing.*;
import java.awt.*;

public class DecisionPanel extends JPanel {

    DecisionPanel(){
        this.setBackground(Color.CYAN);
        this.setLayout(new GridLayout(2,2));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        p1.setLayout(new GridBagLayout());
        p2.setLayout(new GridBagLayout());
        p3.setLayout(new GridBagLayout());
        p4.setLayout(new GridBagLayout());

        p1.add(new DecisionButton("hello"));
        p2.add(new DecisionButton("test"));
        p3.add(new DecisionButton("ttt"));
        p4.add(new DecisionButton("world"));

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

    }
}
