package ut02.contador;

public class Incrementador implements Runnable{

    Contador cont;

    public Incrementador(Contador c){
        cont = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < Principal.NVECES; i++) {
            cont.increment();
        }
    }    
}
