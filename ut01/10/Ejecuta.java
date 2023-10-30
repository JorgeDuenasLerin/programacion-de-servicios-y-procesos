import java.io.IOException;

public class Ejecuta {
    public static void main(String args[]) throws IOException, InterruptedException{
        //ProcessBuilder pb = new ProcessBuilder("ls", "-l");
        ProcessBuilder pb = new ProcessBuilder("");

        for (int i = 0; i < args.length; i++) {
            pb.start();
        }
        
        //p.waitFor();
        System.out.println("Se ha terminado el proceso");
    }
}
