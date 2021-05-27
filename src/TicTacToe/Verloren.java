package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Verloren {
    private JButton zumHauptmenueButton;
    private JButton nochmalButton;
    private JTextField leiderHastDuVerlorenTextField;
    private JPanel Verloren_Gui;
    public Schwierigkeit schwierigkeit3;
    public Modi modi3;

    public Verloren(){
        JFrame Verlorenfenster = new JFrame("TicTacToe - Gewonnen");

        Verlorenfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Verlorenfenster.setSize(600, 600);
        Verlorenfenster.setLocationRelativeTo(null);
        Verlorenfenster.add(Verloren_Gui);
        Verlorenfenster.setVisible(true);

        nochmalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                schwierigkeit3 = new Schwierigkeit();
                Verlorenfenster.setVisible(false);
            }
        });
        zumHauptmenueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modi3 = new Modi();
                Verlorenfenster.setVisible(false);
            }
        });
    }
}
