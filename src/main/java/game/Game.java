package game;

import game.components.Equipment;
import game.components.Spells;
import screen.GameScreen;

import javax.swing.*;

public class Game {
    public static void run(){
        Equipment.init();
        Spells.init();
        JFrame gameScreen = new GameScreen();
    }
}
