package screen.panels.left;

import game.components.MiniMap;
import screen.buttons.MapButton;

import javax.swing.*;
import java.awt.*;

public class MapPanel extends JPanel {
    public MapPanel(){
        this.setLayout(new GridLayout(5,5));
        this.setGrid();
        this.setBackground(Color.cyan);
    }

    private void setGrid() {
        String[] grid = MiniMap.getGrid();
        for(String city : grid){
            this.add(new MapButton(city));
        }
    }
}
