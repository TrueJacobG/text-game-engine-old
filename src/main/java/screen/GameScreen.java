package screen;

import screen.panels.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;

public class GameScreen extends JFrame{
    public GameScreen(){
        this.setTitle("Game Window - work in progress");

        this.setBackground(Color.WHITE);
        this.setIconImage(new ImageIcon("images/logo.png").getImage());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.setLayout(new GridLayout(1, 3));

        this.add(new LeftPanel());
        this.add(new CenterPanel());
        this.add(new RightPanel());

        this.setVisible(true);
    }
}
