package ut01.threads;

public class Principal {

    public static void main(String[] args) {
        HolaThread ta = new HolaThread("Alice", 7);
        HolaThread tb = new HolaThread("Boby", 12);

        Thread exeAlice = new Thread(ta);
        Thread exeBoby = new Thread(tb);

        Cosa c = new Cosa();

        c.start();
        
        // ERROR
        //ta.run();
        //tb.run();
        exeAlice.start();
        exeBoby.start();

        // OJO: run no es concurrente; start sí lo es.
    }    
}
