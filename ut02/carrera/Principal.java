package ut02.carrera;

public class Principal {
     private static final int TOTAL_CARRERA = 100;
    private static final int NUM_CORREDORES = 10;
    private static final int START_DORSAL = 9000;

    public static void main(String[] args) {

        Thread corredores [] = new Thread[NUM_CORREDORES];

        for(int i = 0; i<NUM_CORREDORES; i++){
            corredores[i] = new Thread( 
                new Corredor(TOTAL_CARRERA, START_DORSAL+i)
            );
        };

        System.out.println("¡La carrera va a comenzar!");
        for(int i = 0; i<NUM_CORREDORES; i++){
            corredores[i].start();
        };

        for(int i = 0; i<NUM_CORREDORES; i++){
            try {
                corredores[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        
        System.out.println("¡La carrera ha terminado!");
     }    
}
