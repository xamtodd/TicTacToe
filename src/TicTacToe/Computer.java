package TicTacToe;
import java.util.Random;

public class Computer extends Thread{
    public static int erzeugen(){
        Random random = new Random();

        int a = random.nextInt(9) + 1;
        return a;
    }
}
