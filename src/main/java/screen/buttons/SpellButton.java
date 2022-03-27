package screen.buttons;

import game.elements.Spell;
import game.constants.Size;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpellButton extends JButton implements ActionListener {

    private Spell spell;

    public SpellButton(Spell spell){
        this.spell = spell;

        this.setFocusable(false);
        this.setText(spell.getName());

        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.TOP);

        this.setOpaque(true);

        this.setFont(new Font("Arial Black", Font.PLAIN,22));

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
        if(e.getSource() == this){
            System.out.println(spell.getName());
        }
    }
}
