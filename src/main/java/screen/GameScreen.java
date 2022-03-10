package screen;

import screen.components.Equipment;
import screen.components.Item;
import screen.constants.Size;

import javax.swing.*;
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

        screen.add(new Item("Helmet").getBox(Size.max_window_width - Size.box_size - 250, 20));
        screen.add(new Item("Chestplate").getBox(Size.max_window_width - Size.box_size - 250, 270));
        screen.add(new Item("Weapon").getBox(Size.max_window_width - Size.box_size - 50, 270));
        screen.add(new Item("Shield").getBox(Size.max_window_width - Size.box_size - 450, 270));
        screen.add(new Item("Pants").getBox(Size.max_window_width - Size.box_size - 250, 470));
        screen.add(new Item("Boots").getBox(Size.max_window_width - Size.box_size - 250, 670));

    }
}
