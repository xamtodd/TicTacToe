package TicTacToe;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schwierigkeit {
    private JPanel Schwierigkeit_Gui;
    private JButton easy;
    private JButton medium;
    private JButton hard;
    private JTextField waehleDieSchwierigkeitsstufeTextField;

    private static EasyGame easyGame;

    public Schwierigkeit(){
        JFrame Schwierigkeitfenster = new JFrame("TicTacToe - Modus");

        Schwierigkeitfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Schwierigkeitfenster.setSize(600, 600);
        Schwierigkeitfenster.setLocationRelativeTo(null);
        Schwierigkeitfenster.add(Schwierigkeit_Gui);
        Schwierigkeitfenster.setVisible(true);

        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                easyGame = new EasyGame();
                Schwierigkeitfenster.setVisible(false);
            }
        });
    }
}
