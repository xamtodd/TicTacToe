package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Modi {
    private JPanel Modi_Gui;
    private JPanel Unten;
    private JPanel Oben;
    private JButton singleplayerButton;
    private JButton multiplayerButton;
    private JTextField herzlichWilkommenZuTicTacToeTextField;

    public Schwierigkeit schwierigkeit;
    public Modi(){
        JFrame Modifenster = new JFrame("TicTacToe - Modus");

        Modifenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Modifenster.setSize(600, 600);
        Modifenster.setLocationRelativeTo(null);
        Modifenster.add(Modi_Gui);
        Modifenster.setVisible(true);

        singleplayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                schwierigkeit = new Schwierigkeit();
                Modifenster.setVisible(false);
            }
        });
    }
}
