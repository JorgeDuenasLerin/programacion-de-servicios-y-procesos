package ut01.threads;

public class Cosa extends Thread{
    
    private static final int NVECES = 10;

    @Override
    public void run(){
        for (int i = 0; i < NVECES; i++) {
            System.out.println("Soy una cosa");    
        }
    }

}
