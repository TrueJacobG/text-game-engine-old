package screen.components;

import screen.constants.Size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EqBox{
    public static JLabel getBox(String armor, int x, int y){
        JLabel panel = new JLabel();

        panel.setText(armor);

        // pos to the image, for ex. top means above icon
        panel.setHorizontalTextPosition(JLabel.CENTER);
        panel.setVerticalTextPosition(JLabel.TOP);

        panel.setForeground(Color.BLACK); // text color
        panel.setBackground(Color.LIGHT_GRAY); // text color
        panel.setOpaque(true);
        panel.setFont(new Font("Arial", Font.PLAIN,20));

        panel.setVerticalAlignment(JLabel.CENTER);
        panel.setHorizontalAlignment(JLabel.CENTER);
        panel.setBounds(x, y, Size.box_size, Size.box_size);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
        panel.setBorder(border);

        return panel;
    }
}
