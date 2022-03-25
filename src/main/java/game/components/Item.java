package game.components;

import screen.constants.Size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Item extends JButton implements ActionListener {
    private String id;
    private String name;
    private String durability;
    private String type;
    private String info;


    public Item(String id, String name, String durability, String type, String info){
        this.id = id;
        this.name = name;
        this.durability = durability;
        this.type = type;
        this.info = info;
        // from id get name etc

        this.setText(this.name);

        // pos to the image, for ex. top means above icon
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.TOP);

        this.setOpaque(true);

        this.setFont(new Font("Arial", Font.PLAIN,20));

        this.setVerticalAlignment(JButton.CENTER);
        this.setHorizontalAlignment(JButton.CENTER);
        this.setBounds(0, 0, Size.box_size, Size.box_size);

        this.setForeground(Color.BLACK);

        Border border;
        if(name.equals("")){
            border = BorderFactory.createLineBorder(Color.WHITE, 5);
            this.setBackground(Color.WHITE);
        } else {
            border = BorderFactory.createLineBorder(Color.GRAY, 5);
            this.setBackground(Color.LIGHT_GRAY);
        }

        this.setBorder(border);

        this.addActionListener(this);
    }

    public String toString(){
        return this.name;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            System.out.println(this.name);
        }
    }
}
