package screen.components;

import screen.constants.Size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Item implements ActionListener {

    private String id;
    private String name;
    private JButton button;

    public Item(String id){

        this.id = id;
        this.name = id + ":D";
        // from id get name etc

        Equipment.add(this);
    }

    public String toString(){
        return this.name;
    }

    public JButton getBox(int x, int y){
        button = new JButton();

        button.setText(this.name);

        // pos to the image, for ex. top means above icon
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);

        button.setForeground(Color.BLACK); // text color
        button.setBackground(Color.LIGHT_GRAY); // text color
        button.setOpaque(true);
        button.setFont(new Font("Arial", Font.PLAIN,20));

        button.setVerticalAlignment(JButton.CENTER);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setBounds(x, y, Size.box_size, Size.box_size);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
        button.setBorder(border);

        button.addActionListener(this);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(this.name);
        }
    }
}
