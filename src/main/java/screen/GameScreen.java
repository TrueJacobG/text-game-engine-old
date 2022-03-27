package screen;

import screen.panels.*;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame{
    public GameScreen(){
        this.setTitle("Game Window - work in progress");

        this.setBackground(Color.WHITE);
        this.setIconImage(new ImageIcon("images/logo.png").getImage());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setLayout(new GridLayout(1, 3));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel leftPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        this.add(leftPanel);
        this.add(centerPanel);

        leftPanel.setBackground(Color.YELLOW);
        centerPanel.setBackground(Color.LIGHT_GRAY);
        rightPanel.setBackground(Color.PINK);

        rightPanel.setLayout(new GridLayout(3, 1));


        rightPanel.add(new ArmorStandPanel());
        rightPanel.add(new EquipmentPanel());
        rightPanel.add(new SpellsPanel());

        this.add(rightPanel);

        this.setVisible(true);
    }
}
