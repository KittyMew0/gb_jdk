package geekbrains_course.jdk.lesson1.lecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private static final int WIDTH = 555;
    private static final int HEIGHT = 507;

    JButton btnStart, btnExit;
    SettingsWindow settingWindow;
    Map map;

    GameWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);

        setTitle("TicTacToe");
        setResizable(false);
        btnStart = new JButton("New Game");
        btnExit = new JButton("Exit");
        settingWindow = new SettingsWindow(this);
        map = new Map();

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingWindow.setVisible(true);
            }
        });

        JPanel panBottom = new JPanel(new GridLayout(1, 2));
        panBottom.add(btnStart);
        panBottom.add(btnExit);

        add(panBottom, BorderLayout.SOUTH);
        add(map);

        setVisible(true);
    }

    void startNewGame(int mode, int sizeX, int sizeY, int winLen){
        map.startNewGame(mode, sizeX, sizeY, winLen);
    }
}