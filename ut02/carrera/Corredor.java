package ut02.carrera;

public class Corredor implements Runnable{
    private static final long TIEMPO_DESCANSO = 500;
    private static final double MAX_INTERVALO_KM = 10;
    int kmRecorrido;
    int kmTotales;
    int dorsal;

    public Corredor(int kmTotales, int dorsal) {
        this.kmTotales = kmTotales;
        this.dorsal = dorsal;
        this.kmRecorrido = 0;
    }

    @Override
    public void run() {
        System.out.println(String.format("¡¡Soy el dorsal %d inicio mi carrera!!", dorsal));
        while (kmRecorrido < kmTotales){
            try {
                Thread.sleep((long) ((Math.random()*TIEMPO_DESCANSO)+TIEMPO_DESCANSO));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            kmRecorrido+=Math.random()*MAX_INTERVALO_KM;
            System.out.println(String.format("Dorsal %d: %d/%d", dorsal, kmRecorrido, kmTotales));    
        }
        System.out.println(String.format("¡¡Soy el dorsal %d TERMINÉ!!", dorsal));
    }
}
