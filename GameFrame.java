package com.mycompany.snakegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    GameFrame(){
        JFrame j = new JFrame();
        GamePanel gamepanel = new GamePanel();
        j.setBounds(0,0,615,635);
        j.setTitle("Snake Game");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setResizable(false);
        j.setVisible(true);
        j.add(gamepanel);
    }
    
}
