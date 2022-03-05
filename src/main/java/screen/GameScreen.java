package screen;

import screen.components.EqBox;
import screen.constants.Size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GameScreen {
    public GameScreen(){
        JFrame screen = new JFrame("Game Window - work in progress");
        screen.setLayout(null);

        screen.getContentPane().setBackground(Color.WHITE);

        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setResizable(false);
        ImageIcon image = new ImageIcon("images/logo.png");
        screen.setIconImage(image.getImage());

        screen.setExtendedState(JFrame.MAXIMIZED_BOTH);
        screen.setVisible(true);

        screen.add(EqBox.getBox("Helmet", Size.max_window_width - Size.box_size - 250, 20));
        screen.add(EqBox.getBox("Chestplate", Size.max_window_width - Size.box_size - 250, 270));
        screen.add(EqBox.getBox("Weapon", Size.max_window_width - Size.box_size - 50, 270));
        screen.add(EqBox.getBox("Shield", Size.max_window_width - Size.box_size - 450, 270));
        screen.add(EqBox.getBox("Pants", Size.max_window_width - Size.box_size - 250, 470));
        screen.add(EqBox.getBox("Boots", Size.max_window_width - Size.box_size - 250, 670));
    }
}
