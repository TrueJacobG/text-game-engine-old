package screen.buttons;

import screen.panels.EqOptionPanel;
import screen.panels.StoryPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecisionButton extends JButton implements ActionListener {

    private String text;
    private static EqOptionPanel eqOptionPanel;
    private static StoryPanel storyPanel;
    private static boolean isDisplay = true;

    public DecisionButton(String text){
        this.text = text;
        this.setFocusable(false);
        this.addActionListener(this);
        this.setText(this.text);
    }

    public static void addPanels(EqOptionPanel eq, StoryPanel story){
        eqOptionPanel = eq;
        storyPanel = story;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){

            storyPanel.setVisible(true);
            eqOptionPanel.setVisible(false);


            if(isDisplay){
                storyPanel.changeText("test 1");
                storyPanel.setBackground(Color.BLUE);
                isDisplay = false;
            } else {
                storyPanel.changeText("test 2");
                storyPanel.setBackground(Color.RED);
                isDisplay = true;
            }
        }
    }
}
