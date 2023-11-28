package ut02.contador;

public class Decrementador implements Runnable {
    Contador cont;

    public Decrementador(Contador c){
        cont = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < Principal.NVECES; i++) {
            cont.decrement();
        }
    }    
}
