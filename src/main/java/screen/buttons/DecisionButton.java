package screen.buttons;

import screen.panels.StoryPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecisionButton extends JButton implements ActionListener {

    private String text;
    private StoryPanel panel;
    private static boolean isDiplay = true;

    public DecisionButton(String text, StoryPanel panel){
        this.text = text;
        this.panel = panel;
        this.setFocusable(false);
        this.addActionListener(this);
        this.setText(this.text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            if(isDiplay){
                panel.changeText("test 1");
                panel.setBackground(Color.BLUE);
                isDiplay = false;
            } else {
                panel.changeText("test 2");
                panel.setBackground(Color.RED);
                isDiplay = true;
            }
        }
    }
}
