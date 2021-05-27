package TicTacToe;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class EasyGame{
    public static JFrame EasyGamefenster;
    public static boolean gewonnen;
    public String zug;
    public static int z;
    public static char [] za = {'.', '.', '.'};
    public static char [] zb = {'.', '.', '.'};
    public static char [] zc = {'.', '.', '.'};
    public static boolean aktiv;

    public static HashSet<Integer> hashSet;
    public static Gewonnen gewonnenob;
    public static Unenschieden unenschiedenob;
    public static Verloren verlorenob;
    public static Font font;
    public static Computer computer;
    public static Warten warten;
    private JPanel EasyGame_Gui;
    private JPanel Oben;
    private JPanel Unten;
    private JLabel a;
    private JLabel leer;
    private JLabel eins;
    private JLabel zwei;
    private JLabel drei;
    private JLabel b;
    private JLabel c;
    private JTextArea a1;
    private JTextArea a2;
    private JTextArea a3;
    private JTextArea b1;
    private JTextArea b2;
    private JTextArea b3;
    private JTextArea c1;
    private JTextArea c2;
    private JTextArea c3;
    private JButton a1Button;
    private JButton b1Button;
    private JButton c1Button;
    private JButton a2Button;
    private JButton b2Button;
    private JButton c2Button;
    private JButton a3Button;
    private JButton b3Button;
    private JButton c3Button;
    private JTextField amZug;

    public EasyGame(){
        hashSet = new HashSet<>();
        aktiv = true;
        font = new Font("Arial", Font.PLAIN, 60);
        gewonnen = false;
        z = 0;
        computer = new Computer();
        EasyGamefenster = new JFrame("TicTacToe - EasyGame");

        EasyGamefenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EasyGamefenster.setSize(600, 600);
        EasyGamefenster.setLocationRelativeTo(null);
        EasyGamefenster.add(EasyGame_Gui);
        EasyGamefenster.setVisible(true);

        amZug.setText("Du bist am Zug!");

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    za[0] = 'X';
                    hashSet.add(1);

                    a1Button.setEnabled(false);

                    a1.setText("X");
                    a1.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    za[2 - 1] = 'X';
                    hashSet.add(2);

                    a2Button.setEnabled(false);

                    a2.setText("X");
                    a2.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    za[3 - 1] = 'X';
                    hashSet.add(3);

                    a3Button.setEnabled(false);

                    a3.setText("X");
                    a3.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        b1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    zb[1 - 1] = 'X';
                    hashSet.add(4);

                    b1Button.setEnabled(false);

                    b1.setText("X");
                    b1.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        b2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    zb[2 - 1] = 'X';
                    hashSet.add(5);

                    b2Button.setEnabled(false);

                    b2.setText("X");
                    b2.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        b3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    zb[3 - 1] = 'X';
                    hashSet.add(6);

                    b3Button.setEnabled(false);

                    b3.setText("X");
                    b3.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        c1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    zc[1 - 1] = 'X';
                    hashSet.add(7);

                    c1Button.setEnabled(false);

                    c1.setText("X");
                    c1.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        c2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    zc[2 - 1] = 'X';
                    hashSet.add(8);

                    c2Button.setEnabled(false);

                    c2.setText("X");
                    c2.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
        c3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(aktiv == false){

                }else {
                    z++;
                    zc[3 - 1] = 'X';
                    hashSet.add(9);

                    c3Button.setEnabled(false);

                    c3.setText("X");
                    c3.setFont(font);

                    amZug.setText("Der Computer ist am Zug!");

                    auswerten();
                    computerantwort();
                }
            }
        });
    }
    public void computerantwort(){
        if(z < 8) {
            aktiv = false;
            int ant = computer.erzeugen();
            //System.out.println(ant);

            if (hashSet.contains(ant)) {
                computerantwort();
            } else {
                if (gewonnen == false) {
                    z++;
                    hashSet.add(ant);
                    switch (ant) {
                        case 1:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    a1.setText("O");
                                    a1.setFont(font);
                                    hashSet.add(1);
                                    za[0] = 'O';
                                    a1Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 2:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    a2.setText("O");
                                    a2Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    a2.setFont(font);
                                    hashSet.add(2);
                                    za[1] = 'O';
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);

                            break;
                        case 3:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    a3.setText("O");
                                    a3.setFont(font);
                                    hashSet.add(3);
                                    za[2] = 'O';
                                    a3Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 4:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    b1.setText("O");
                                    b1.setFont(font);
                                    hashSet.add(4);
                                    zb[0] = 'O';
                                    b1Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 5:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    b2.setText("O");
                                    b2.setFont(font);
                                    hashSet.add(5);
                                    zb[1] = 'O';
                                    b2Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 6:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    b3.setText("O");
                                    b3.setFont(font);
                                    hashSet.add(6);
                                    zb[2] = 'O';
                                    b3Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 7:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    c1.setText("O");
                                    c1.setFont(font);
                                    hashSet.add(7);
                                    zc[0] = 'O';
                                    c1Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 8:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    c2.setText("O");
                                    c2.setFont(font);
                                    hashSet.add(8);
                                    zc[1] = 'O';
                                    c2Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                        case 9:
                            new java.util.Timer().schedule(new java.util.TimerTask() {
                                public void run() {
                                    c3.setText("O");
                                    c3.setFont(font);
                                    hashSet.add(9);
                                    zc[2] = 'O';
                                    c3Button.setEnabled(false);
                                    amZug.setText("Du bist am Zug!");
                                    aktiv = true;
                                    auswerten();
                                }
                            }, 2000);
                            break;
                    }
                }
            }

        }else {
            auswerten();
        }
    }
    public static void auswerten(){
        for(int i = 0; i < za.length; i++){
            System.out.print("|");
            System.out.print(za[i]);
            System.out.print("|");
        }
        System.out.println("");
        for(int i = 0; i < zb.length; i++){
            System.out.print("|");
            System.out.print(zb[i]);
            System.out.print("|");
        }
        System.out.println("");
        for(int i = 0; i < zc.length; i++){
            System.out.print("|");
            System.out.print(zc[i]);
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("-------------");


        if ((za[0] == 'X') & (za[1] == 'X') & (za[2] == 'X') & (gewonnen == false)) { //Zeile1
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            nullen();
        }
        if ((za[0] == 'X') & (zb[1] == 'X') & (zc[2] == 'X') & (gewonnen == false)) { //Quer1
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((zb[0] == 'X') & (zb[1] == 'X') & (zb[2] == 'X') & (gewonnen == false)) { //Zeile2
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((zc[0] == 'X') & (zc[1] == 'X') & (zc[2] == 'X') & (gewonnen == false)) { //Zeile3
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((zc[0] == 'X') & (zb[1] == 'X') & (za[2] == 'X') & (gewonnen == false)) { //Quer2
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[0] == 'X') & (zb[0] == 'X') & (zc[0] == 'X') & (gewonnen == false)) { //Hoch1
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[1] == 'X') & (zb[1] == 'X') & (zc[1] == 'X') & (gewonnen == false)) { //Hoch2
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[2] == 'X') & (zb[2] == 'X') & (zc[2] == 'X') & (gewonnen == false)) { //Hpch3
            System.out.println("X Gewonnen");
            gewonnen = true;
            gewonnenob = new Gewonnen();
            EasyGamefenster.setVisible(false);
            nullen();
        }

        if ((za[0] == 'O') & (za[1] == 'O') & (za[2] == 'O') & (gewonnen == false)) { //Zeile1
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[0] == 'O') & (zb[1] == 'O') & (zc[2] == 'O') & (gewonnen == false)) { //Quer1
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();

        }
        if ((zb[0] == 'O') & (zb[1] == 'O') & (zb[2] == 'O') & (gewonnen == false)) { //Zeile2
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((zc[0] == 'O') & (zc[1] == 'O') & (zc[2] == 'O') & (gewonnen == false)) { //Zeile3
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((zc[0] == 'O') & (zb[1] == 'O') & (za[2] == 'O') & (gewonnen == false)) { //Quer2
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[0] == 'O') & (zb[0] == 'O') & (zc[0] == 'O') & (gewonnen == false)) { //Hoch1
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[1] == 'O') & (zb[1] == 'O') & (zc[1] == 'O') & (gewonnen == false)) { //Hoch2
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if ((za[2] == 'O') & (zb[2] == 'O') & (zc[2] == 'O') & (gewonnen == false)) { //Hpch3
            System.out.println("O Gewonnen");
            gewonnen = true;
            verlorenob = new Verloren();
            EasyGamefenster.setVisible(false);
            nullen();
        }
        if((z == 9) & (gewonnen == false)){
            System.out.println("unenschieden!");
            gewonnen = true;
            unenschiedenob = new Unenschieden();
            EasyGamefenster.setVisible(false);
            nullen();
        }
    }
    public static void nullen(){
        za[0] = '.';
        za[1] = '.';
        za[2] = '.';

        zb[0] = '.';
        zb[1] = '.';
        zb[2] = '.';

        zc[0] = '.';
        zc[1] = '.';
        zc[2] = '.';


        for(int i = 0; i < za.length; i++){
            System.out.print("|");
            System.out.print(za[i]);
            System.out.print("|");
        }
        System.out.println("");
        for(int i = 0; i < zb.length; i++){
            System.out.print("|");
            System.out.print(zb[i]);
            System.out.print("|");
        }
        System.out.println("");
        for(int i = 0; i < zc.length; i++){
            System.out.print("|");
            System.out.print(zc[i]);
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("-------------");

        EasyGamefenster.setVisible(false);
    }
}
