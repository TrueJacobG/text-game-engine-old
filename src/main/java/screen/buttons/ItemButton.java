package screen.buttons;

import game.elements.Item;
import screen.panels.center.EqOptionPanel;
import screen.panels.center.StoryPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemButton extends JButton implements ActionListener{

    private Item item;
    public static EqOptionPanel eqOptionPanel;
    public static StoryPanel storyPanel;

    public ItemButton(Item item){
        this.item = item;

        this.setFocusable(false);
        this.setText(item.getName());
        this.setFont(new Font("Arial", Font.PLAIN,20));


        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.TOP);
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);

        this.setOpaque(true);
        this.setForeground(Color.BLACK);
        this.setBackground(Color.WHITE);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
        this.setBorder(border);

        this.addActionListener(this);
    }

    public static void addPanels(EqOptionPanel eq, StoryPanel story){
        eqOptionPanel = eq;
        storyPanel = story;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this && item.isItem()) {

            eqOptionPanel.setVisible(true);
            storyPanel.setVisible(false);

            System.out.println(this.item.getName());

            eqOptionPanel.setBackground(Color.BLACK);
        }
    }
}

