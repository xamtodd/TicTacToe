package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gewonnen {
    private JPanel panel1;
    private JButton zumHauptmenueButton;
    private JButton nochmalButton;
    private JTextField herlichenGlueckwunschDuHatTextField;
    private JPanel Gewonnen_Gui;
    public Schwierigkeit schwierigkeit2;
    public Modi modi2;

    public Gewonnen(){
        JFrame Gewonnenfenster = new JFrame("TicTacToe - Gewonnen");

        Gewonnenfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gewonnenfenster.setSize(600, 600);
        Gewonnenfenster.setLocationRelativeTo(null);
        Gewonnenfenster.add(Gewonnen_Gui);
        Gewonnenfenster.setVisible(true);
        nochmalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                schwierigkeit2 = new Schwierigkeit();
                Gewonnenfenster.setVisible(false);
            }
        });
        zumHauptmenueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modi2 = new Modi();
                Gewonnenfenster.setVisible(false);
            }
        });
    }
}
