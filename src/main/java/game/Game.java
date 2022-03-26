package game;

import game.components.Equipment;
import screen.GameScreen;

import javax.swing.*;

public class Game {
    public static void run(){
        Equipment.init();
        JFrame gameScreen = new GameScreen();
    }
}
