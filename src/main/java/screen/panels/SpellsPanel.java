package screen.panels;

import game.elements.Spell;
import game.components.Spells;
import screen.buttons.SpellButton;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;

import java.util.List;

public class SpellsPanel extends JPanel {
    public SpellsPanel(){
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GREEN);
        this.addSpells();
        this.setVisible(true);
    }

    private void addSpells() {
        List<Spell> spells = Spells.getSpells();

        for(Spell spell : spells){
            this.add(new SpellButton(spell));
        }

    }
}
