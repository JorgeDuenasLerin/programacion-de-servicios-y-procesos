package ut02.contador;

public class Contador {
    int c;
    public Contador(){
        c = 0;
    }
    public void increment(){
        int d;
        for (int i = 0; i < Principal.NVECES; i++) {
            // Hago cosas
            d = i*i*i;
        }
        synchronized (this){
            c = c + 1;
        }
    }

    public void decrement(){
        int d;
        for (int i = 0; i < Principal.NVECES; i++) {
            // Hago cosas
            d = i*i*i;
        }
        synchronized (this){
            c = c - 1;
        }
    }

    public String toString(){
        return String.valueOf(c);
    }
}
