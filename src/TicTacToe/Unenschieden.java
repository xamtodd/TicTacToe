package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Unenschieden {
    private JButton nochmalButton;
    private JButton zumHauptmenueButton;
    private JTextField schonNichtSchlechtUnenschiedenTextField;
    private JPanel Uneschieden_Gui;
    public Schwierigkeit schwierigkeit4;
    public Modi modi4;

    public Unenschieden(){
        JFrame Uneschiedenfenster = new JFrame("TicTacToe - Uneschieden");

        Uneschiedenfenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Uneschiedenfenster.setSize(600, 600);
        Uneschiedenfenster.setLocationRelativeTo(null);
        Uneschiedenfenster.add(Uneschieden_Gui);
        Uneschiedenfenster.setVisible(true);

        nochmalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                schwierigkeit4 = new Schwierigkeit();
                Uneschiedenfenster.setVisible(false);
            }
        });
        zumHauptmenueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modi4 = new Modi();
                Uneschiedenfenster.setVisible(false);
            }
        });
    }
}
