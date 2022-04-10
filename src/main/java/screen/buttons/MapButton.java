package screen.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MapButton extends JButton implements ActionListener {

    private static boolean enabled = false;
    private String cityName;

    public MapButton(String cityName){
        this.cityName = cityName;

        this.setText(cityName);
        this.setFont(new Font("Arial", Font.PLAIN,20));
        this.setFocusable(false);

        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.TOP);
        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);


        this.setOpaque(true);
        this.setForeground(Color.BLACK);
        this.setBackground(Color.WHITE);

        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this){

        }
    }
}
