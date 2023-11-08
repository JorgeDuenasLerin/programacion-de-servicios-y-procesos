package ut01.threads;

public class HolaThread implements Runnable{

    private static final double DELAY_ITER = 11100;
    private String nombre;
    private int veces;

    public HolaThread(String nombre, int veces) {
        this.nombre = nombre;
        this.veces = veces;
    }

    @Override
    public void run() {
        for (int i = 0; i < veces; i++) {
            System.out.println(nombre);
            // DELAY
            for (int j = 0; j < Math.random()*DELAY_ITER; j++) {
                int c = (j * j * j) / (i+1)*j;
            }
        }
    }
}
