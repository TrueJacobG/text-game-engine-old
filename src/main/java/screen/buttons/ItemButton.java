package screen.buttons;

import game.elements.Item;
import game.constants.Size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemButton extends JButton implements ActionListener{

    private Item item;

    public ItemButton(Item item){
        this.item = item;

        this.setFocusable(false);
        this.setText(item.getName());

        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.TOP);

        this.setOpaque(true);

        this.setFont(new Font("Arial", Font.PLAIN,20));

        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setPreferredSize(new Dimension(Size.boxWidth, Size.boxHeight));

        this.setForeground(Color.BLACK);
        this.setBackground(Color.WHITE);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);
        this.setBorder(border);

        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            System.out.println(this.item.getName());
        }
    }
}

