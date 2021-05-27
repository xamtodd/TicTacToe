package TicTacToe;

public class Warten extends Thread{
    public Warten(){

    }
    public void start(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
